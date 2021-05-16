package week2

fun main() {
    var any = "Monish"
    if(any is String){ //is is used to check whether any is an instance of string
        val s = any as String //as is used to typecast to String
        //however typecast is not necessary as smart cast automatically determines the instance of
        s.toUpperCase()
    }

    //Typecast using as throws an exception if the expression can't be cast.
    //to solve this issue we can use safe cast instead
    //safe cast  with ? returns null if can't be cast or else returns the expression value.

    val p:String? = any as? String
    //this line means
    val q = if(any is String)any else null


}