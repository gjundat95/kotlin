package cast

import java.lang.IllegalArgumentException

/**
 * Created by Jundat95 on 5/26/2017.
 */

interface Expr
class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e : Expr) : Int {
    if(e is Num){
        val n = e as Num
        return n.value
    }
    if(e is Sum){
        return eval(e.left) + eval(e.right)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun evalWhen(e :Expr): Int =
        when(e){
            is Num -> e.value
            is Sum -> evalWhen(e.left) + evalWhen(e.right)
            else -> throw IllegalArgumentException("Unknown expression")
        }
fun evalWithLogging(e :Expr) : Int =
        when(e){

            is Num -> {
                println("Num: ${e.value}")
                e.value
            }

            is Sum -> {
                var left = evalWithLogging(e.left)
                var right = evalWithLogging(e.right)
                println("Sum : $left + $right")
                left+right
            }

            else -> throw IllegalArgumentException("Unknown Expression")
        }