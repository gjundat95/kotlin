package enumtest

/**
 * Created by Jundat95 on 5/25/2017.
 */

fun main(args: Array<String>) {
    println("Color Value: "+Color.RED.fgb())
    println("Mneonic: ${getMnemonic(Color.VIOLET)}")
    println("MixColor: ${mix(Color.RED,Color.YELLOW)}")
}

