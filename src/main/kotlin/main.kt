//import java.util.*
import java.util.Random

fun main(args: Array<String>) {
   // val rand = java.util.Random()
    val rand = Random() // HEAP  STACK
   // val r2 = rand;
    var secret = rand.nextInt(101)
    secret = (0..100).random()
    println("Hello World!")
    var guessed = false
    do {
        print("what is your next guess? >")
        var stringGuess = readLine()
        if( stringGuess == null)
            return
        var guess = stringGuess!!.toInt()
        if(guess == secret) {
            println("you won!")
            guessed = true
        } else if(guess > secret) {
            println("your guess is too big, please try again")
        } else {
            println("your guess is too small, please try again")
        }
    }while (!guessed)


}