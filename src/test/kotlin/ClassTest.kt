import org.junit.Test

import org.junit.Assert.*

class ClassTest {

    @Test
    fun toValdateGetClassName() {
        val kotin = Courses("Java")
        val classes = Class(kotin)
        assertEquals(kotin, classes.getClassName())
    }
}