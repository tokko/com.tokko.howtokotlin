

//convert to set
private var prop: String = "..."

fun getProp() = prop
fun setProp(v: String){
    println("New value: $v")
    prop = v
}


























//by lazy
private var _os: String? = null
val os: String
    get(){
        if(_os == null){
            println("Computing")
            _os = System.getProperty("os.name") +
                    " v" + System.getProperty("os.version") +
                    " (" + System.getProperty("os.arch") + ")"
        }
        return _os!!
    }

fun main(args: Array<String>){
    for(i in 1..3)
        println(os)
}