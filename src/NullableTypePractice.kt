fun main() {
    //by default the types are non nullable, to make the type nullable add a question mark after the data type
    var name1: String = "oscar jones"
    //name1 = null would not compile because by default it does not accept null values

    //this would work because it is made a nullable type by adding the question mark in front of the data type
    var name2: String? = "oscar trey"

    //accessing data from a nullable requires the ? mark before the method call
    var size = name2?.length ?: 0

    println(size)
}