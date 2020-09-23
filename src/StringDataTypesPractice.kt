fun main() {
    var name: String = "oscar jones"
    var grade: Char = 'B' //16 bit unicode character
    //for concatenation
    println("name is $name with grade : $grade")
    //for concatenation with variable using a method
    println("name is $name with grade : $grade with name length ${name.length}")


    //for strings with multiple lines use triple quotes i.e "" 3 times , with trimIndent method to remove the indentation
    var message = """
        hello $name,
        your score grade is $grade
    """.trimIndent()

    println(message)


    //to check if a string is blank (i.e true if there is no item or contains whitespace)
    println(" name is blank ${name.isBlank()}")

    //to check if a string is empty (i.e false if there is an item including whitespace)
    println(" name is blank ${name.isEmpty()}")
}