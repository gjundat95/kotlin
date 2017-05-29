package classtest

import java.util.*

/**
 * Created by Jundat95 on 5/25/2017.
 */
class Rectangle(val height: Int, val width: Int){
    var isSquare : Boolean = true
    get() = width == height

    fun getWidth() {
        println(width)
    }
}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
