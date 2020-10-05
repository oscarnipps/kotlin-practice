package school

class Teacher(
        var firstName: String? = null ,
        var lastName: String? = null,
        var level: Int? = null ,
        var isVerified: Boolean? = null
) {

    //constructor for non-verified teacher i.e teacher without isVerified value passed (since default values are used)
    constructor(firstName: String, lastName: String, level: Int): this(firstName,lastName,level,false)
}