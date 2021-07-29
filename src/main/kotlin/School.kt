interface School {

    //School interface holds basic school database for the Principal to inherit
    var theStudents: ArrayList<Applicant> //admitted student database

    var theApplicant: MutableList<String> //Applicant data base

    var theCourses: MutableList<String> //Course database

    var totalNoStudents: Int //Total number of students

    var maxAge: Int //Maximum age of students can get admission

    fun displayStudents(): Boolean //Students display

    fun admitStudent(name: String, courseTitle: String, age: Int): Boolean //admits applicants to become students

}