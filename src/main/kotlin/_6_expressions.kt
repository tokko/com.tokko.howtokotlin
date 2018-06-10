
class Example(val a: Int, val b: String?, val c: Boolean)

fun main(args: Array<String>){

    //you need a good reason to use var
    var ex = Example(1, null , true)


    //with
    val a = ex.a
    val b = ex.b
    val c = ex.c
    println("a = " + a + ", b = " + b + ", c = " + c)


    //mapOf Pairs, then to
    val map = HashMap<String, Int>()
    map.put("k1", 1)
    map.put("k2", 2)
    map.put("k3", 3)

    //deconstruct
    for (e in map.entries){
        val key = e.key
        val value = e.value
        println(key + " -> " + value)
    }


    //assign expression
    var s: String
    if(System.currentTimeMillis() % 2L == 0L){
        println("You were lucky")
        s = "Lucky!"
    }
    else
        s = "Unlucky, bro"
    println(s)
}


fun test(e: Example): String{
    //lift out return, compact lines
    when(e.a){
        1 -> return "Odd"
        2 -> return "Even"
        3 -> return "Odd"
        4 -> return "Even"
        5 -> return "Odd"
        6 -> return "Even"
        else -> return "Too big"
    }
}


fun test2(str: String?): String?{
    println(str!!.length)

    if(str != null){
        str.forEach { it ->
            println(it)
        }
    }

    //elvis return
    if(str == null) return null
    if(str == null) throw RuntimeException("Unexpected null!")
    if(str == null) error("Unexpected null")
    return ""
}