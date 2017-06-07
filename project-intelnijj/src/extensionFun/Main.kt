package extensionFun


/**
 * Created by jundat95 on 30/05/2017.
 */

fun String.lastChar(): Char = this.get(this.length - 1)

fun Int.multi(n: Int): Int = this.toInt() * n

fun main(args: Array<String>) {
    val a: String = "Doan Tinh"
    val b: Int = 5
    println(a.lastChar())
    println(b.multi(7))
}