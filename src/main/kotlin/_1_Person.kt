class Person {
    private val firstName: String
    private val lastName: String
    constructor(firstName: String, lastName: String){
        this.firstName = firstName
        this.lastName = lastName
    }

    fun getFirstName(): String{
        return firstName
    }

    fun getLastName(): String{
        return lastName
    }
}