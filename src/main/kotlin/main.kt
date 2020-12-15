fun main(args: Array<String>) {
    println("Hello World!")
    var guessed = false
    do {
        print("what is your next guess? >")
        var stringGuess = readLine()
        if( stringGuess == null)
            return
        var guess = stringGuess!!.toInt()
        if(guess == 100) {
            println("you won!")
            guessed = true
        } else if(guess > 100) {
            println("your guess is too big, please try again")
        } else {
            println("your guess is too small, please try again")
        }
    }while (!guessed)


}