package collectiontest

/**
 * Created by jundat95 on 29/05/2017.
 */

fun main(args: Array<String>) {
    collection()
}

fun collection(){
    val temp1 = setOf("tinhngo","xuantu","chulinh","haianh")
    val temp2 = listOf(1, 2, 3, 4, 5)
    val temp3 = mapOf(1 to 'A', 5 to 'B', 6 to 7, 4 to 'X')
    println(temp3.javaClass)
    println(temp3.get(6))
}