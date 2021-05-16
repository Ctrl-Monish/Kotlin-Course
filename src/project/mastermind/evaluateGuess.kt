package mastermind

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    var rightPosition = 0
    var wrongPosition = 0
    var secretindex = 0
    var guessfrequency = Array<Int>(26) { 0 }
    var secretfrequency = Array<Int>(26) { 0 }


    for (ch in secret)
        secretfrequency[ch - 'A'] += 1
    for (ch in guess)
        guessfrequency[ch - 'A'] += 1

    for (ch in secret) {
        var guessindex = 0
        if(guessfrequency[ch-'A']>0) {
            for (c in guess) {
                if (ch == c) {
                    if (guessindex == secretindex) {
                        guessfrequency[c - 'A']--
                        rightPosition++
                    } else {
                        if(secretfrequency[c-'A']<=guessfrequency[c-'A']){
                            if(guess[secretindex] == ch){
                                guessfrequency[c - 'A']--
                                rightPosition++
                            }else{
                                guessfrequency[c - 'A']--
                                wrongPosition++
                            }
                        }
                    }
                    secretfrequency[c-'A']--
                    break
                }
                guessindex++
            }
        }
        secretindex++
    }
    return Evaluation(rightPosition, wrongPosition)
}