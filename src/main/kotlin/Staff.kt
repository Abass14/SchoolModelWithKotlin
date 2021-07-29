abstract class Staff(var salary: Long,
                     var role: String, val id: Int): Person {
    override var age: Int = 0
    override var name: String = ""
}