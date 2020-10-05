package school

class Util {

    companion object {

        fun displayTag() {
            println("teacher tag -> 99FD")
        }

        fun displayMaxStudentCount() {
            println("max total students number : ${Constants.MAX_STUDENTS}")
        }

        fun displayTeacherInfo(teacher: Teacher) {
            var info = """
       teacher first name : ${teacher.firstName}
       teacher last name : ${teacher.lastName}
       teacher level : ${teacher.level}
       is teacher verified : ${teacher.isVerified}
   """.trimIndent()
            println("$info \n")
        }
    }

}