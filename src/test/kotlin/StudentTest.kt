import org.junit.Test

import org.junit.Assert.*

class StudentTest {

    @Test
    fun toValidateAddStudentCourse() {
        val student = Student()
        assertEquals(true, student.addStudentCourse("Abass", "Kotlin", 23))
    }

    @Test
    fun toValidateDisplayCourseList() {
        val student = Student()
        assertEquals(true, student.displayCourseList())
    }

    @Test
    fun toValidateDisplayClassList() {
        val student = Student()
        assertEquals(true, student.displayClassList())
    }
}