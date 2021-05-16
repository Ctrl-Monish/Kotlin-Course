package week1

/*
-extension functions extends the class.
-they are defined outside the class but can be called as regular members of the class.
-we can see that java standard library classes are used under the hood
-Kotlin standard library is just java standard library and a bunch of extensions and some classes that provide smooth interoperability.
-there is no such thing as kotlin sdk it's just java standard library with some extensions
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
    val list = listOf(1,7,53)
    val map = hashMapOf(1 to "one",7 to "seven",53 to "fifty-three")
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    //extensions are called just like member functions
    println(list.sum())
}

//making an extension to sum all values ot a list.
//To declare an extension function, prefix its name with a receiver type, that means the type being extended.
fun List<Int>.sum(): Int{
    var result = 0
    for(i in this){ //this keyword is used to access this list
        result+=i
    }
    return result
}

    /*
    Examples of extensions
    1. getOrNULL in Array and List - It returns either an element or null if your index is wrong
    2. withIndex - Returns an Iterable that wraps each element of the original array into an IndexedValue
                   containing the index of that element and the element itself.
    3. until - To iterate a number range which does not include its end element, use the until function.
               it is an infix we can call it like a regular function like .until(10) or in infix form using just "until"
               it looks like a built in syntax but it's not it's just an extension function called in infix form.
    4. to - simply returns a pair of values. used to enumerate key to value pairs in maps. eg: "hot" to red.
            it is also mostly used in infix form like 'until' it is also just an extension function.
    5. extensions on char- isLetter, isDigit, as discussed earlier are extension functions only.
                            they perform such functionality: c in '0'..'9' || c in 'a'..'z' || c in 'A'..'Z'
     */

    /*
        Extensions for Strings
        Under the hood kotlin language strings is java.lang.String and kotlin library just provides some extensions for it.
        1. """ triple quotes Strings - used for multi-line strings.
                                       eg: val q = """monish is nice,
                                                      but very lazy."""
                                       We can not use special characters in them.
                                       we might want to crop indent as in triple quotes it becomes a part of the string.
        2. trimMargin -  Here the default margin is used, but you can specify another marginPrefix if needed.
                         The marginPrefix is automatically cut out together with indent.
                         eg: """monish is nice,
                              #but very lazy""".trimMargin(prefix = "#")
        3. trimIndetnt - this can be called directly to trim indents if there is same indent in all the lines of the string it will be removed.
                         eg: """monish is nice,
                              #but very lazy""".trimIndent()
        4. toInt() and toDouble() - used to convert strings to numbers.  but if we try to convert something other than integer
                                    it will give an error NumberFormatException error.
                                    to avoid this we can use toIntOrNull to return null if it isn't an integer.

     */

