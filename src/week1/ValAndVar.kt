package week1

fun main() {

    /*
    1. var are mutable variables and thus can be changed.
    2. val are immutable or read only variables, cannot be reassigned or changes later.
    3. val in kotlin responds to final keyword in java.
    4. Kotlin is statically typed language, which means every variable and expression has a type.
    5. Even is we ommit the type the compiler infers it for us.
     */


    //is the type is easy to understand like primitive data types or String then we can o mit it
    //if there is any scope of confusion it's better to specify the type explicitly.

    var name = "Monish" //String type is inferred by compiler
    println(name)
    var age : Int = 20
    println(age)


    //val can be modified. it is an immutable reference to an object like final variables in java
    //we can modify the object inside by accessing the modification method
    //but can not assign another reference
    //val doesn't give any guarantee about the content stored in it.
    //if the content is mutable it can by modified.
    val languages = mutableListOf("English")
    println(languages)
    languages.add("Japanese")
    languages.add("Hindi")
    print(languages)

    val list = listOf("java")
    //list in kotlin is by default read-only list
    //and in read-only list the object cannot be modified
    //for this we can use a mutableList instead.
}