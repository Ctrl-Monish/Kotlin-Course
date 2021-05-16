package week2


/* UNDER THE HOOD

Under the hood, nullable types are implemented using annotations.
The Kotlin compilers simply adds Nullable and NotNullable annotations to the corresponding types usages.
Which gives us no performance overheads when using Nullable types.
There is another solution to the same Nullability problem which is called Optional or Option types.
They are special library classes that store value or absence of of the value and you can check whether the value is available or no.
That solves the same problem as nullable types because optional allow you to say explicitly whether the variable can have no value option similar to null or not.
Despite nullable types and optional solve the same problem, they are very different in terms of the performance.
Optional type is a wrapper that stores the reference to the initial object. For each optional value an extra object is created.
At the same time, nullable types don't create any wrappers. They are implemented by annotations.
 */


fun main() {
    //string by default cannot store null value
    //we can't pass null whenever a non-nullable type is expected.
    //The compiler error tells us that null cannot be a value of a non-nullable type name.
    val s1:String = "hello world"
    //with ? we can assign null or no-null value to a string
    val s2:String? = null

    s1.length //doesn't give any exception but
    //s2.length
    // gives an error coz kotlin compiler knows it can be nullable.

    //to solve this the easiest way is to check if the reference is not null
    //if we use if function the compiler knows that s2 variable is smart cast to nullable type.
    //and we can execute it afterwards without ?.
    if(s2!=null)
        s2.length


    //ideally there is a better way to express the same if condition.
    // we can use safe call,this checks whether the value is null or not
    //if it is null it returns null if no-null value is present it returns the value.
    s2?.length

    //Elvis Operator (?:). Elvis operator (?:) is used to return the not null value even the conditional expression is null.
    //this returns 0 as default value when the expression is null.
    //the result is either left expression if it is not null or right expression if it is null.

    val length = s2?.length ?: 0

    val a:Int? = null
    val b:Int? = 1
    val c:Int = 2
    val ans1 = (a?:0) + c
    val ans2 = (b?:0) + c
    println("$ans1$ans2")

    /*
    Null pointer assertion -
       we can explicitly throw null pointer exception by using null pointer assertion !!
       it throws null pointer exception if the operand is null and the operand if it's not null.
       With not-null assertion operator, you explicitly emphasize where null pointer exception can be thrown.
       And if it's thrown, you can see directly what might be the cause.
       That means it doesn't make sense to put two or more not-null assertion operators in one line.
       As you won't to be able to say which one cause the exception
     */

    /*
    Nullable Lists -
        When you use a list of ints, you can put the question mark after int, or after list itself, or in both places.
        The first one means that every element might be either null or not null.
        And the second one means the whole list might be either null or not null.
     */
    val list1:List<Int?>
    val list2:List<Int>?
}

fun String?.isEmptyOrNull(): Boolean = this=="" || this == null