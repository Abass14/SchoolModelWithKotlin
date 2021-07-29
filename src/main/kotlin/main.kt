import java.util.*

fun main(args: Array<String>) {
    //Object Instances of various classes
    val principal = Principal("John",350000,"Principal", 111)
    val student = Student()
    val nonAcademicsOne = NonAcademics(50000, "Admin", 311)
    val teacher = Teacher(250000, "Teacher", 211)
    val applicant = Applicant()
    val menu = Menu(4, 0,0,3,0, 3,0,4)

    //Welcome Message
    println(menu.welcomeMessage())

    //Do while loop for the control of the entire Menu
    do{
        println(menu.mainMenu()) //Main-Menu
        try {
            menu.selectMenu() //Main-Menu Selector function
            when(menu.menuSelect){
                1->{
                    try {
                        do {
                            try {
                                principal.duty()
                                println(menu.principalMenu())  //Principal Sub-Menu
                                menu.principalSelectMenu()  //Principal menu selector
                                when(menu.principalMenuSelect){
                                    1 ->{
                                        try {
                                            //Condition for principal to expel a student
                                            if (principal.theStudents.isEmpty()) {
                                                println("!!! You have no students. You have no one to expel !!!")
                                            }else{
                                                principal.displayStudents() //Current Student list display
                                                println("Enter Student to be expelled")
                                                val expName = readLine().toString() //Name of Student to be expelled
                                                /*The iterator functions below are used to delete students from
                                                  from various lists such as the the student list, student-course list
                                                  and the student class list
                                                 */
                                                val iter: MutableIterator<Applicant> = principal.theStudents.iterator()
                                                val kot: MutableIterator<String> = student.getKotlin().iterator()
                                                val jav: MutableIterator<String> = student.getJava().iterator()
                                                val javClass: MutableIterator<String> = student.getJavaClass().iterator()
                                                val andrClass: MutableIterator<String> = student.getAndroidClass().iterator()
                                                //Deleting student from student list
                                                while (iter.hasNext()) {
                                                    val str = iter.next()
                                                    if (expName == str.getName()) iter.remove()
                                                }
                                                //Deleting student from student course list kotlin
                                                while (kot.hasNext()) {
                                                    val str = kot.next()
                                                    if (expName == str) {
                                                        kot.remove()
                                                    }else{
                                                        println("!!! $expName is not a student !!!")
                                                    }
                                                }
                                                //Deleting student from student course list java
                                                while (jav.hasNext()) {
                                                    val str = jav.next()
                                                    if (expName == str) jav.remove()
                                                }
                                                //Deleting student from student class list Java
                                                while (javClass.hasNext()) {
                                                    val str = javClass.next()
                                                    if (expName == str) javClass.remove()
                                                }
                                                //Deleting student from student class list Android
                                                while (andrClass.hasNext()) {
                                                    val str = andrClass.next()
                                                    if (expName == str) andrClass.remove()
                                                }
                                                principal.displayStudents() //Display student left after expulsion of a student
                                            }
                                        }catch (e: InputMismatchException){
                                            println(menu.errorMessage())
                                        }
                                    }
                                    2 ->{
                                        try {
                                            //Applicant applying to be a student
                                            applicant.inputDetails() //Applicant inputs
                                            //Principal admits students with the admitStudent Function
                                            principal.admitStudent(applicant.getName(), applicant.getCourse(), applicant.getAge())
                                            //Student are added to their various course and class
                                            student.addStudentCourse(applicant.getName(), applicant.getCourse(), applicant.getAge())
                                        }catch (e: NumberFormatException){
                                            println(menu.errorMessage())
                                        }
                                    }
                                    3 ->{

                                    }
                                    else ->{
                                        println(menu.errorMessage())
                                    }
                                }
                            }catch (e: NumberFormatException){
                                println(menu.errorMessage())
                            }
                        }while (menu.principalMenuCount != menu.principalMenuSelect)
                    }catch (e: NumberFormatException){
                        println(menu.errorMessage())
                    }
                }
                2->{
                    try {
                        //Teacher Menu
                        teacher.inputDetails() //Teacher takes inputs
                        teacher.duty()
                        do {
                            try {
                                println(menu.teacherMenu()) //Teacher Sub-Menu
                                menu.teacherSelect() //Teacher menu Selector
                                when(menu.teacherMenuSelect){
                                    1 -> {
                                        principal.displayStudents() //Display Student list
                                    }
                                    2 ->{
                                        student.displayCourseList() //Display student course list
                                    }
                                    3 ->{
                                        student.displayClassList() //Display student class list

                                    }
                                    4 ->{

                                    }
                                    else -> {
                                        println(menu.errorMessage())
                                    }
                                }
                            }catch (e: NumberFormatException){
                                println(menu.errorMessage())
                            }
                        }while (menu.teacherMenuCount != menu.teacherMenuSelect)
                    }catch (e: NumberFormatException){
                        println(menu.errorMessage())
                    }

                }
                3->{
                    try {
                        //Non-Academic staff Menu
                        nonAcademicsOne.inputDetails() //non-staff input
                        nonAcademicsOne.duty()
                        do {
                            try {
                                println(menu.nonStaffMenu()) //Non-Staff Sub-Menu Display
                                menu.nonStaffSelectMenu() //Non-Staff Menu Selector
                                when(menu.nonStaffMenuSelect){
                                    1 ->{
                                        principal.displayStudents() //Display student list
                                    }
                                    2 ->{
                                        student.displayCourseList() //Display Student-Course List
                                    }
                                    3 ->{

                                    }
                                    else ->{
                                        println(menu.errorMessage())
                                    }
                                }
                            }catch (e: NumberFormatException){
                                println(menu.errorMessage())
                            }
                        }while (menu.nonStaffMenuCount != menu.nonStaffMenuSelect)
                    }catch (e: NumberFormatException){
                        println(menu.errorMessage())
                    }
                }
                4->{
                    println("Bye! Thank you!")
                }
                else -> {
                    println(menu.errorMessage())
                }
            }
        }catch (e: NumberFormatException){
            println(menu.errorMessage())
        }

    }while (menu.menuCount != menu.menuSelect)

}