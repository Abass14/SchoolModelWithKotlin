import kotlin.collections.ArrayList

open class Principal(override var name: String, salary:Long, role:String, id: Int): Staff(salary, role, id), School {
    /*
    Class Principal inherits abstract class staff and implements interface School
    Principal has duties such as admitting and expelling students,
    and has direct access to the School's database (School Interface)
    */
//    override var name: String = "" //Initializing overridden properties of abstract staff class
    override var age: Int = 0

    //overridden function that states duty of principal from Staff
    override fun duty() {
        println("This is the $role and he can either admit Student or Expel students")
    }

    //Overridden database lists from School Interface
    override var theApplicant: MutableList<String> = ArrayList()
    override var theStudents: ArrayList<Applicant> = ArrayList()
    override var totalNoStudents: Int = 0
    override var theCourses: MutableList<String> = ArrayList()
    override var maxAge: Int = 25

    //Creating an instance of the courses available in the School for registration
    private val kotlin = Courses("Kotlin")
    private val java = Courses("Java")


    //Function admitStudents checks the age and type of course applying student inputs
    override fun admitStudent(name: String, courseTitle: String, age: Int): Boolean {
        if (age <= maxAge && (courseTitle == kotlin.getTitle() || courseTitle == java.getTitle())) {
            var applicant = Applicant()
            applicant.setDetails(name,age,courseTitle)
            theStudents.add(applicant)
            totalNoStudents++
            println("*** Congratulations $name! You have been admitted into the School ***")
        }else{
            println("!!!$name, sorry, you are either ove-aged or selected an unavailable course. You cannot successfully apply!!!")
        }
        return true
    }

    //Function displayStudents displays the list of admitted applicants = Students
    override fun displayStudents(): Boolean {
        println("List of students: $theStudents")
        return true
    }
}