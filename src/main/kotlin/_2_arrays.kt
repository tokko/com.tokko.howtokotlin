
//data class
fun parseName(name: String): List<String>{
    val space = name.indexOf(" ")
    return listOf(
            name.substring(0, space),
            name.substring(space+1)
    )
}


fun main(args: Array<String>){
    val name = parseName("Sauron Annatar")
    val first = name[0]
    val last = name[1]

    println(first + " " + last)

    if(name != parseName("Sauron Annatar")){
        println("Equals doesn't work")
    }
}