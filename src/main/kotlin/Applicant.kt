class Applicant() {
    private var courseTitle: String = ""
    private var name: String = ""
    private var age: Int = 0

    //getters for class Applicant's properties
    fun getName() = name
    fun getAge() = age
    fun getCourse() = courseTitle

    fun setDetails(nameInput : String, ageInput : Int, course : String){
        courseTitle = course
        name = nameInput
        age = ageInput

    }

    //This Function prompts the Applicant details input
    fun inputDetails() {
        println(">>> Applicants over age 25 can't apply. \n *** NOTE: Only Kotlin and Java are available courses to apply for")
        print("Enter applicant's name: ")
        name = readLine().toString()
        print("Enter applicant's age: ")
        age = readLine()!!.toInt()
        print("Enter applicant's Course: ")
        courseTitle = readLine().toString()
    }

    override fun toString(): String = "Name: $name -> Age: $age -> Course: $courseTitle"

}