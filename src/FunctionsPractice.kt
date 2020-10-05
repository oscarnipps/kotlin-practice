fun main() {
    displayAge()
    displayUserDetails("oscar jones",24,  false)
    println()
    //using named parameters (i.e variableName = value) still works
    displayUserDetails(name ="john jones",age = 22, isVerified =  true)

    displayNames("bob","joel","richard","powell")
}

//without return type
fun displayAge() {
    println("your age is ${getAge(12)}\n")
}

//with single parameter
fun getAge(age: Int): Int{
   return age * 2
}

//
fun displayUserDetails(name: String, age: Int, isVerified: Boolean){
   var message = """
       name is $name
       age is $age
       isVerified is
   """.trimIndent()
    println(message)
}

//function using different arguments of the same type (the vararg should be the last parameter)
fun displayNames(vararg names: String) {
    names.forEach { println(it) }
}
