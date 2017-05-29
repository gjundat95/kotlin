package classtest

/**
 * Created by Jundat95 on 5/25/2017.
 */

class Person(name:String, isMarried: Boolean) {
    var name: String? = null
    var isMarried: Boolean = false
}

fun main(args: Array<String>) {
    val person = Person("Bood", true)
    person.name = "Tinh Ngo"
    println(person.name)
    person.isMarried = true
    println(person.isMarried)
}