package overrideextension

/**
 * Created by jundat95 on 31/05/2017.
 */
open class View {
    open fun click() = println("View Clicked")
}

class Button: View() {
    override fun click() {
        println("Button Clicked")
    }
}

fun main(args: Array<String>) {
    val view: View = Button()
    view.showOff()
}

fun View.showOff() = println("View ShowOff")
fun Button.showOff() = println("Button ShowOff")