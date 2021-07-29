class NonAcademics(salary: Long,
                   role: String, id: Int): Staff(salary, role, id) {
    override var name: String = ""
    override var age: Int = 0

    fun inputDetails() {
        print("Enter your name: ")
        name = readLine().toString()
        print("Enter your age: ")
        age = readLine()!!.toInt()
    }

    override fun duty() {
        println("I $name am a $role with staff id $id")
    }
}