package fortest

/**
 * Created by Jundat95 on 5/26/2017.
 */


fun fizzBuzz(i: Int) =
        when{
            i % 15 == 0 -> "FizzBuzz"
            i % 3 == 0 -> "Fizz"
            i % 5 == 0 -> "Buzz"

            else -> " $i "
        }
