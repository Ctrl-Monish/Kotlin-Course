package week1

/*
extension functions extends the class.
they are defined outside the class but can be called as regular members of the class.
 */

/*
here we define a function to get the last character of a String.
here String is the receiver of the getLastChar function.
in the body of the function receiver can be referred to with 'this' keyword.
we can even omit reference of the receiver as we can call directly the members of the receiver class.
without using 'this.something' explicitly.

Note- we can't define an extension function anywhere and use it everywhere we have to import it explicitly.
      By default it is not accessible to the whole project, even though it is visible in auto-completion.

When we need to call an extension function in java as discussed earlier we know all top-level functions are called as static functions.
the extension function work in the same way, they are called in java as regular static functions.

Under the hood, at the basket level when this function is compiled to a static function, the receiver is transformed to the extra first parameter.
When you call these extension function from Java, you pass String expression explicitly as the first argument.
eg: System.out.println(lastChar("Monish"));

Note: we can not access private members of a class in an extension function.
      like in java we can not call a private member from a static function defined outside the class.

      Kotlin extension functions are most of the time top-level functions defined in a special extra file which content is compiled to an extra auxiliary class.
      Therefore, it's not possible to call a private member of a class from an extension to this class
 */
fun String.getLastChar() = this[this.length-1]
fun String.lastChar() = get(length-1)

fun main() {
    //it is being called as a regular member function of String class.
    val c = "Monish".getLastChar()
    val d = "Monish".lastChar()
    println("$c $d")

    val set = hashSetOf(1,7,53)
    val list = arrayListOf(1,7,53)
    val map = hashMapOf(1 to "one",7 to "seven",53 to "fifty-three")
    //we can see that java standard library classes are used under the hood
    //Kotlin standard library is just java standard library and a bunch of extensions that provide smooth interoperability.
    //there is no such thing as kotlin sdk it's just java standard library with some extensions
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
}

