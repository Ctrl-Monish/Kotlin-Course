package week1
import week1.Color.*

fun main() {
    //if is an expression in kotlin. that means if returns a value that can be assigned to a variable
    //in kotlin thereis no ternary operator like in java
    val a = 5
    val b = 10
    val max = if(a>b) a else b

    //when in kotlin seems like analogous to switch of java
    //in kotlin we no longer need to use break to say that operation should stop here.
    // if a condition is satisfied their corresponding branch is returned

    //"is" is analogous to java's instanceOf
    //it can be used with when in case of hierarchy
    //is checks weather an argument is of a specific type.
}

enum class Color{
    BLUE, YELLOW, RED
}

fun getColor(color: Color): String =
    when(color){
        BLUE -> "Cold"
        YELLOW -> "Warm"
        RED -> "Hot"
    }

//we can use multiple values to return the same result separated by comma.
fun result(input: String) = when(input) {
    "y", "yes" -> "agree"
    "n", "no" -> "disagree"
    else -> "maybe"
}
//we can use any expression not only constants as branch condition
fun mix(c1: Color, c2:Color) = when(setOf(c1,c2)) { //here a set of two colours is being compared.
    setOf(RED,BLUE) -> "Purple"
    setOf(YELLOW,RED) -> "Orange"
    else -> "Dirty color"
}
