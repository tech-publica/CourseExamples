package objectOrientedInto.abstract

class ItalianAccount(var region: String, balance: Double) : Account(balance) {
    override fun deposit(amount: Double) {
        println("deposit in Italian")
        // super.deposit(amount)
        balance += .9 * amount
    }
}