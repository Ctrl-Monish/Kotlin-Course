/*
In Kotlin we can define functions anywhere.
we can define-
1. top - level functions - functions directly in code without any class.
2. member functions - functions specified inside a class.
3. local functions - functions defined inside another function.

Not: we can call the top level functions in a java code as a static function of the class which name corresponds to a file name.
 */


package week1

//if the return type of a function is not specified it means the function returns a 'Unit'
//Unit is analogous to void in java.
//We can specify Unit explicitly but no one does that and is not required.

fun main() {
    println(max(4,5))
    print(max2(5,6))
    getMeUser(age=23,name="monish")
}


//takes two arguments of Int type and returns an int value.
fun max(a:Int, b:Int) : Int{
    return if(a>b) a else b
}

//if your function returns only one expression we can write
//we can use alternate syntax, function with expression body
//we can specify the return type explicitly or also can let the compile infer it.
fun max2(a:Int, b:Int) = if(a>b) a else b


/*
Types of arguements
1. positional arguments
2. default arguments - if no value is passed default is called otherwise the value passed is used.
You can either specify each argument value or omit it and use the default value.
3. named arguments - while calling the function we can pass arguments with names, then their order or position won't matter
if we write even one named argument we need to use named arguments for all other arguments after that.
 */

fun getMeUser(name: String, age: Int, isActive: Boolean = false){
}
