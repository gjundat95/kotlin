package infixTest

/**
 * Created by jundat95 on 01/06/2017.
 */

infix fun Any.to(other: Any) = Pair(this,other)

infix fun Int.sub(other: Int): Int = this + other

//infix fun Any.on(other: Any): Boolean{
//
//}

fun main(args: Array<String>) {
    val (number, name) = 1 to "once"
    println(5 sub 6)

}