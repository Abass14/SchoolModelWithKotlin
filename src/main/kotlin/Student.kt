open class Student: Person{

    //Overridden properties from Person -> name of student and age of student
    override var name: String = ""
    override var age: Int = 0

    //Two instances of class Courses (kotlin and Java), these are the only courses available for registration
    private val kotlin = Courses("Kotlin")
    private val java = Courses("Java")

    /*
    The variables below are instances of Class class
    that uses aggregation with courses class to get their course Title
    */
    private val androidC = Class(kotlin)
    private val javaC = Class(java)

    //These are the lists of student course
    private var kotlinCourse: MutableList<String> = ArrayList() //student who offer kotlin
    private var javaCourse: MutableList<String> = ArrayList() //Student who offer Java
    private var androidClass: MutableList<String> = ArrayList()
    private var javaClass: MutableList<String> = ArrayList()

    //These are getters and setters for private student-course list variables above
    fun getKotlin() = kotlinCourse
    fun getJava() = javaCourse
    fun getJavaClass() = javaClass
    fun getAndroidClass() = androidClass

    //This function validates the course inputted by student and restrict them to the available courses only
    //It also validates the student's age not being greater than 25
    fun addStudentCourse(name: String, courseTitle: String, age: Int): Boolean{
        when (courseTitle) {
            kotlin.getTitle()->{
                if (age <= 25) {
                    kotlinCourse.add(name)
                    androidClass.add(name)
                    println("Welcome to Class -> ${androidC.getClassName()}")
                }
            }
            java.getTitle()->{
                if (age <= 25) {
                    javaCourse.add(name)
                    javaClass.add(name)
                    println("Welcome to ${javaC.getClassName()}")
                }
            }
            else -> println("Wrong Input. Course does not exist")
        }
        return true
    }

    //This function displays lists of student in the course they offer
    fun displayCourseList(): Boolean{
        println("List of student's offering Kotlin: $kotlinCourse")
        println("List of student's offering Java: $javaCourse")
        return true
    }

    //This function displays student-class list
    fun displayClassList(): Boolean{
        println("We have ${androidClass.size} number of students in Android Class: $androidClass")
        println("We have ${javaClass.size} number of students in Java Class: $javaClass")
        return true
    }

    override fun duty() {
        println("$name, you are a student and you can take a course")
    }
}