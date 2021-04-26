package week1

/*
1. returns true if the character passed is a lower case or upper case letter else false.
- 'in' is used to check if the character is in the specified range of characters
- under the hood the compiler generates this code as: 'a'<=c && c<= 'z'
2. we can also use not in = '!in' which checks weather an element is not in the range
3. we cn use in with when.
 */
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotNum(c: Char) = c !in '0'..'9'
fun check(c: Char) = when(c){
    in '0'..'9'-> "Number"
    in 'a'..'z',in 'A'..'Z' -> "Alphabet"
    else -> "I don't know"
}
fun isValidIdentifier(s: String): Boolean {
    fun isValidCharacter(c: Char) = //local function to check weather it is an valid character
        c=='_' || c in '0'..'9' || c in 'a'..'z' || c in 'A'..'Z'
    if(s.isEmpty() || s[0] in '0'..'9') return false //if string is empty or first char is a number return false
    for (ch in s){
        if (!isValidCharacter(ch))
            return false
    }
    return true
}

fun isValidIdentifier2(s: String): Boolean {
    fun isValidCharacter(c: Char) = //local function to check weather it is an valid character
        c=='_' || c.isLetterOrDigit()
    if(s.isEmpty() || s[0].isDigit()) return false //if string is empty or first char is a number return false
    for (ch in s){
        if (!isValidCharacter(ch))
            return false
    }
    return true
}
fun main() {
    //in can also be used to check for belonging
    println(isLetter('C'))
    println(isNotNum('r'))
    println(check('a') + " " + check('2') + " " + check('*'))

    //we can create ranges of different elements and can store ranges in variables of RangeType
    val intrange: IntRange = 1..9
    val anotherintrange = 1 until 10
    val stringrange: ClosedRange<String> = "aa".."zz"

    //in check simply compares the element is within bounds.
    //we compare the strings lexicographically by default  and get true as a result.
    // K goes between j and s in the alphabet
    // But V isn't between j and s
    println("Kotlin" in "Java".."Scala") //true
    println("VSCode" in "Java".."Scala") //false
}


