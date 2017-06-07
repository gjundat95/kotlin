package fortest

import java.util.*

/**
 * Created by Jundat95 on 5/26/2017.
 */

fun main(args: Array<String>) {

    println(isLetter('A'))
    println(isDigit('a'))
    println(recognize('!'))
    println("Kotlin" in "Java".."Scala")

}

fun demoFor1(){
    for (i in 1..100){
        println()
        print(fizzBuzz(i))
    }
}
fun demoFor2(){
    for (i in 100 downTo 1 step 5){
        print("-${i}")
    }
}
fun demoFor3(){
    val binaryReps = TreeMap<Char,String>()

    for(c in 'A' .. 'Z'){
        val binary = Integer.toBinaryString(c.toInt());
        binaryReps[c] = binary;
    }

    for ((letter, binary) in binaryReps){
        println("$letter = $binary")
    }
}

fun demoFor4(){
    val list = arrayListOf<String>("10","12","20","99")
    for ((index, element) in list.withIndex()){
        println("$index : $element")
    }
    for (item in list){
        print("== $item ")
    }
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

fun isDigit(c: Char) = c !in '0'..'9'

fun recognize(c : Char) =
        when(c){
            in '0'..'9' -> "it is digit"
            in 'a'..'z', in 'A'..'Z' -> "it is letter"
            else -> "I don't known"
        }