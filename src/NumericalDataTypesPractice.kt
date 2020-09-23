fun main() {
    //numerical types in kotlin
    val byte: Byte = 8
    val short: Short = 16
    val myInt: Int = 32
    val myLong: Long = 64
    //decimals
    val myFloat: Float = 32.00F
    val myDouble: Double = 32.00

    //in kotlin , everything is an object , so you can then call different methods on the variables
    //since they all extend the Numbers class
    val resultInDouble = myDouble.times(myDouble)
    println("result double is $resultInDouble ")
}