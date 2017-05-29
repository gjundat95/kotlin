package cast

/**
 * Created by Jundat95 on 5/26/2017.
 */
fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(10), Num(5)),Num(15))))
}
