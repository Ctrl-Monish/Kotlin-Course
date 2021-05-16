package week1



import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

/*
kotlin doesn't differentiate checked or unchecked exceptions
in kotlin you may or may not handle any exception and
your function does't need to define which exception it can throw
 in Java rules for checked exceptions are often require you to write
 a logic meaningless code to withdraw or ignore exceptions,
 and this rule doesn't really help you to prevent possible errors.
 This is why in Kotlin this decision was made.
 */

/*
Throw is an expression in kotlin
you can assign it's result in a variable
we can assign throw to a variable of any type.
 */
fun main() {
    val string = "10"
    val number = try{
        Integer.parseInt(string)
    } catch (e: NumberFormatException){
        null
    }
    val percent = if (number in 0..100)
        number
    else
        throw IllegalArgumentException(
            "value must be between 0 and 100: $number"
        )
}

/*
Try can catch an exception if it was thrown inside check it for
being of a specific type and perform the corresponding actions.

unlike java in kotlin try is an expression and can be assigned to a variable.

when we throw a checked exception in kotlin and we need to handle it in java
 we need to use @throw annotation.
otherwise java will throw an error that exception is never thrown.
java needs throw to catch a checked exception.

if the function is in kotlin we don't need to use @throw annotation
 */