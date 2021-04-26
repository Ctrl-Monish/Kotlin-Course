package week1


//in kotlin we have same while and do-while loops as in java
//for loop looks a bit different
//Note: 'to' creates a pair in kotlin and not range so can't iterate

fun main() {
    val list = listOf("apples", "mangoes", "cherries")
    for (fruits in list){ //if we want we can specify element type explicitly (fruits:String in list)
        println(fruits)
    }

    //in kotlin we can iterate over the contents of a map
    val map = mapOf(1 to "one",
                    2 to "two",
                    3 to "three")
    for ((key,value ) in map){
        println("$key = $value")
    }

    //this syntax is not only used for maps but can be used over collections with index
    val letters = listOf("a","b","c")
    for((index,element) in letters.withIndex()){
        println("$index of $element")
    }

    //iterating over ranges - if we need to use index directly like normal for loop in java
    for(i in 1..9){ //last element is included prints 123456789
        print(i)
    }
    println()
    //we can also traverse through a range using until function
    for (i in 1 until 9){ //last element is not included prints 12345678
        print(i)
    }
    println()
    //we can iterate over more complecated ranges like
    for (i in 9 downTo 1 step 2){ //last element is included and jump of 2 is taken prints 97531
        print(i)
    }
    println()
    //we can even iterate over a String without chaging it into character array
    for(ch in "abcd"){
        print(ch + 1)
    }
}