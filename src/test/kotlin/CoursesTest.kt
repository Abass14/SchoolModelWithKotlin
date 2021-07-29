import org.junit.Test

import org.junit.Assert.*

class CoursesTest {

    @Test
    fun getTitle() {
        val courses = Courses("Kotlin")
        assertEquals("Kotlin", courses.getTitle())
    }
}