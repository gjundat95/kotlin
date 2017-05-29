package function

/**
 * Created by Jundat95 on 5/25/2017.
 */

fun max(a:Int, b:Int):Int {
    if(a > b) return a
    else return b
}
fun min(a:Int, b:Int) = if(a>b) b else a

fun main(args: Array<String>) {
    println(max(3,4))
    println(min(3,4))
}