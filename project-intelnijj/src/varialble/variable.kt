package varialble

/**
 * Created by Jundat95 on 5/25/2017.
 */

fun main(args: Array<String>) {
    var a = 10

    val b = "Tinh Ngo"

    val c:Double = 6.2

    var t:String? = null
    t = "Tinh Ngo"

    println(a--)
    println(a)

    for(item in b){
        println(item)
    }

    // object that it point
    val language = arrayListOf<String>("Java")
    language.add("Kotlin")
    for(item in language){
        println("Name: "+item)
    }

    //Variable
    var temp = "Hacker"
    println(temp)

}
