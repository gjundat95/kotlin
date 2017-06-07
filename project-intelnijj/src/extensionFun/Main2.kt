package extensionFun

/**
 * Created by jundat95 on 30/05/2017.
 */


fun main(args: Array<String>) {
    val a = "Tinh Ngo".lastChar()
    println(a)
    // extension
    val b = arrayListOf<String>("1", "2", "3", "4")
    println(b.join(
            "= "
    ))
    // Good bye
    val c = listOf<String>("Tinh Ngo","Doan Tinh", "Tinh Tang", "Ngo Tinh")
    println(c.lastIndex())

    val d = listOf<Int>(1, 2, 5, 3)
    println(d.maxInt())
}

fun <T> Collection<T>.joinToString(
        separator: String =", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix);

    for((index, element) in this.withIndex()){
        if(index > 0){
            result.append(separator)
            result.append(element)
        }
    }
    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
        separator: String =", ",
        prefix: String = "",
        postfix: String = ""
): String = joinToString(separator, prefix, postfix)

fun <T> List<T>.lastIndex(): T = this.get(this.size - 1)

fun Collection<Int>.maxInt(): Int? {
    return this.max()
}