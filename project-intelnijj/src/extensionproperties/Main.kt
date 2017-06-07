package extensionproperties

/**
 * Created by jundat95 on 31/05/2017.
 */

fun main(args: Array<String>) {
    val a = "ngo doan tinh"
    println(a.lastChar)

    val b = StringBuilder("tinh ngo")
    println(b.lastChar)
    b.lastChar = 't'
    println(b.lastChar)


}

val String.lastChar : Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
        get() = get(length  - 1)
        set(value: Char){
            this.setCharAt(length - 1, value)
        }

