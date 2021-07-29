import org.junit.Test

import org.junit.Assert.*

class MenuTest {

    @Test
    fun errorMessage() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals("Wrong input, please try again with accepted inputs", menu.errorMessage())
    }

    @Test
    fun selectMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        menu.menuSelect = 2
        assertEquals(2, menu.menuSelect)
    }

    @Test
    fun welcomeMessage() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals(">>> Welcome to the Basic School Bot \n >>> Students should register in the Principal section \n >>> Students can view Student List with Teachers and Non-Academic Staff", menu.welcomeMessage())
    }

    @Test
    fun mainMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals("Enter 1 or 2 ro expel or admit Student \n 1. PRINCIPAL \n 2. TEACHER \n 3. NON-ACADEMICS STAFF \n 4. exit", menu.mainMenu())
    }

    @Test
    fun principalSelectMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        menu.principalMenuSelect = 2
        assertEquals(2, menu.principalMenuSelect)
    }

    @Test
    fun principalMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals(">>> Select 1 or 2 to Admit or Expel Students \n 1. EXPEL STUDENT \n 2. ADMIT APPLICANT \n 3. Back to Main Menu", menu.principalMenu())
    }

    @Test
    fun nonStaffSelectMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        menu.nonStaffMenuSelect = 2
        assertEquals(2, menu.nonStaffMenuSelect)
    }

    @Test
    fun nonStaffMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals("1. DISPLAY STUDENT LIST \n 2. DISPLAY STUDENT COURSE LIST \n 3. Back to Main Menu", menu.nonStaffMenu())
    }

    @Test
    fun teacherSelect() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        menu.teacherMenuSelect = 2
        assertEquals(2, menu.teacherMenuSelect)

    }

    @Test
    fun teacherMenu() {
        val menu = Menu(4, 0,0,3,0, 3,0,4)
        assertEquals("1. DISPLAY STUDENT LIST \n 2. DISPLAY STUDENT COURSE LIST \n 3. Back to Main Menu", menu.teacherMenu())
    }
}