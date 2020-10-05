package school

fun main() {

    //when using with empty constructor class instances should be initialized to null (given default values)
    var teacherA: Teacher = Teacher()

    //with empty constructor
    var teacherB = Teacher("john","siemens",1)

    //using a companion object (similar to static variables in java)
    Util.displayTag()
    Util.displayMaxStudentCount()
    Util.displayTeacherInfo(teacherB)
}
