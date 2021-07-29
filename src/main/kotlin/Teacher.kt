open class Teacher(salary: Long, role: String, id: Int): Staff(salary, role, id){

    override var name: String = ""
    override var age: Int = 0
    private var teacherCourse: String = ""

    fun inputDetails() {
        print("Enter your name: ")
        name = readLine().toString()
        print("Enter your age: ")
        age = readLine()!!.toInt()
        print("Enter your Course: ")
        teacherCourse = readLine().toString()

    }

    override fun duty() {
        println("I $name am a $role and I teach $teacherCourse")
    }

}