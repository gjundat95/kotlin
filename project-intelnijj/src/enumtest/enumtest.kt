package enumtest



/**
 * Created by Jundat95 on 5/25/2017.
 */

enum class Color (val r: Int, val g: Int, val b: Int){
    RED(255, 0, 0),
    YELLOW(255, 255, 255),
    ORANGE(255, 165, 0),
    BLUE(0, 0, 255),
    GREEN(0, 255, 0),
    INDIGO(75, 0,130),
    VIOLET(238, 130, 238);

    fun fgb() = (r * 256 + g) * 256 + b
}
fun getMnemonic(color: Color) =
        when(color){
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.BLUE -> "Battle"
            Color.GREEN -> "Gave"
            Color.INDIGO, Color.VIOLET,Color.YELLOW -> "In"

        }

fun mix(c1: Color, c2: Color) =
        when(setOf(c1,c2)){
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO

            else -> throw Exception("Dirty color")
        }

fun mix2(c1:Color, c2:Color) =
        when{
            (c1 == Color.RED && c2 == Color.YELLOW) ||
                    (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
            (c1 == Color.YELLOW && c2 == Color.BLUE) ||
                    (c1 == Color.BLUE && c2 == Color.YELLOW) -> Color.GREEN

            else -> throw Exception("Dirty color")
        }