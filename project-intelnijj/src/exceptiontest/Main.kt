package exceptiontest

/**
 * Created by jundat95 on 29/05/2017.
 */
fun main(args: Array<String>) {

    var data: Int?
    println("Enter number?")
    var name:String? = readLine()
    if(name != null){
        try {
            data = Integer.parseInt(name)
            println("My number is: "+data)
        }catch (e: NumberFormatException){
            println(e)
        }finally {
            println("Disconnect")
        }
    }else{
        println("Please enter number")
    }

}

