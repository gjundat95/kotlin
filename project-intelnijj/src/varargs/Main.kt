package varargs

/**
 * Created by jundat95 on 01/06/2017.
 */

fun main(args: Array<String>) {
    val a = arrayOf(1, 2, 3)
    val list = asList(-1, 0, *a, 4)
    println(list)
}

fun <T> asList(vararg ts:T): List<T> {
    var result = ArrayList<T>()
    for (t in ts){
        result.add(t)
    }
    return result
}