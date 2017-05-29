package fortest

/**
 * Created by Jundat95 on 5/26/2017.
 */

fun main(args: Array<String>) {

    for (i in 100 downTo 1 step 5){
        print("-${i}")
    }

    for (i in 1..100){
        println()
        print(fizzBuzz(i))
    }

}
