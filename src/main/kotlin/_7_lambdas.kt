fun main(args: Array<String>){
    val numers = (1..100).toList()

    //to filter/map and also
    val list = mutableListOf<String>()
    for(it in numers){
        if(it % 16 == 0){
            list.add("0x" + it.toString(16))
        }
    }
    println(list)
}

fun repeat(times: Int, body: (Int) -> Unit){
    for(index in 0 until times)    {
        body(index)
    }}