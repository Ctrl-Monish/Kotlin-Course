/*
-Interoperability : Kotlin is a JVM language. So, we can have both kotlin and java code in one project (but not in the same file.)
-Kotlin is compiled in Java ByteCode.
-Kotlin is not a strictly object oriented programming language it is a functional programming language.
 That means we can write kotlin program with just functions unlike java, classes are not compulsory.
 */

//https://developer.android.com/courses/android-basics-kotlin/android-basics-kotlin-vocab?authuser=1

package week1
//An entry point to a Kotlin application is the main function. In Kotlin 1.3, you can declare main without any parameters.
// The return type is not specified, which means that the function returns nothing.
//main function can also be written without any arguments.
fun main(args: Array<String>) {
    //there is no built-in syntax for array in kotlin unlike java.
    //Array is a class in kotlin

    println("Hello World!")

    //'if' is an expression in kotlin and it's result can be saved in a variable
    val user = if(args.size>0) args[0] else "Kotlin"
    //we can insert a value into a string by using '$' sign and variable name
    println("Hello, $user")

    //we can also insert a value of an expression using $ and surrounding it in curly braces eg: ${function call()}s
    //the function in${function()} is executed as many times as it is called there is no unexpected optimisation
    println("Hello, ${demo()}, Hi again ${demo()}")

    //as no value is passed it prints 'null'
    print("Hello, ${args.getOrNull(0)}")
    //as in java when there is nothing in a string and we try to print it it calls java.lang.String
    //which transforms null constant to the string 'null' and prints 'null'
    //if we want an empty string in java instead of null we have to process that explicitly.
}

fun demo(): String{
    println("Demo Called")
    return "Demo"
}