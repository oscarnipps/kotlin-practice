fun main() {
    displayAge()
    displayUserDetails("oscar jones",24,  false)
    println()
    //using named parameters (i.e variableName = value) still works
    displayUserDetails(name ="john jones",age = 22, isVerified =  true)
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