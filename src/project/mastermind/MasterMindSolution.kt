package project.mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {

    //zip returns a list of pair where each pair contains the characters of both the strings at the same index
    //we then just compare if the characters in a pair are same.
    val rightPositions = secret.zip(guess).count { it.first == it.second }

    val commonLetters = "ABCDEF".sumBy { ch ->
        //we count the number of times each letter comes in both the strings
        //then we find the min of that.
        Math.min(secret.count { it == ch }, guess.count { it == ch })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}

fun main(args: Array<String>) {
    print(evaluateGuess("BCDF", "ACEB"))
    print(evaluateGuess("AAAF", "ABCA"))
    print(evaluateGuess("ABCA", "AAAF"))
}