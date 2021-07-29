data class Menu(val menuCount: Int,
           var menuSelect: Int,
           var principalMenuSelect: Int,
           var principalMenuCount: Int,
           var nonStaffMenuSelect: Int,
           var nonStaffMenuCount:Int,
           var teacherMenuSelect: Int,
           var teacherMenuCount: Int) {

    //The Menu Class is a data class that holds all the data for the Structure of Main Menu and sub Menu

    //This method prints out error message for wrong inputs
    fun errorMessage():String{
        return "Wrong input, please try again with accepted inputs"

    }

    //This method request for menuSelector input
    fun selectMenu(): Int{
        print("Select Menu: ")
        menuSelect = readLine()!!.toInt()
        return menuSelect
    }

    //This returns the Start up welcome message
    fun welcomeMessage(): String{
        return ">>> Welcome to the Basic School Bot \n>>> Students should register in the Principal section \n>>> Students can view Student List with Teachers and Non-Academic Staff"
    }

    //This returns the Main Menu
    fun mainMenu(): String{
       return  "Enter 1 or 2 ro expel or admit Student \n 1. PRINCIPAL \n 2. TEACHER \n 3. NON-ACADEMICS STAFF \n 4. exit"
    }

    //This returns the principal subMenu selector
    fun principalSelectMenu(): Int{
        println("Choose 1 or 2 to Admit an applicant or Expel a student")
        principalMenuSelect = readLine()!!.toInt()
        return principalMenuSelect
    }

    //This returns the Principal subMenu
    fun principalMenu(): String{
        return ">>> Select 1 or 2 to Admit or Expel Students \n 1. EXPEL STUDENT \n 2. APPLICANTS, APPLY HERE \n 3. Back to Main Menu"
    }

    //This returns non staff submenu selector
    fun nonStaffSelectMenu(): Int{
        print("Press 1 or 2 to display Admitted applicant list or Student list: ")
        nonStaffMenuSelect = readLine()!!.toInt()
        return nonStaffMenuSelect
    }

    //this returns the non staff submenu
    fun nonStaffMenu(): String{
        return "1. DISPLAY STUDENT LIST \n 2. DISPLAY STUDENT COURSE LIST \n 3. Back to Main Menu"
    }

    //This returns the teacher submenu selector
    fun teacherSelect(): Int{
        println("Press 1 or 2 to display Student list or Student Course list: ")
        teacherMenuSelect = readLine()!!.toInt()
        return teacherMenuSelect
    }

    //this returns the teacher submenu
    fun teacherMenu(): String{
        return "1. DISPLAY STUDENT LIST \n2. DISPLAY STUDENT COURSE LIST \n3. DISPLAY CLASS LIST \n4. Back to Main Menu"
    }
}