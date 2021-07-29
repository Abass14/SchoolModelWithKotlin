import org.junit.Test

import org.junit.Assert.*

class PrincipalTest {



    @Test
    fun admitStudent() {
        val principal = Principal("John", 300000, "principal", 111)
        assertEquals(true, principal.admitStudent("Abass", "Kotlin", 22))
    }

    @Test
    fun displayStudents() {
        val principal = Principal("John", 300000, "principal", 111)
        assertEquals(true, principal.displayStudents())
    }
}