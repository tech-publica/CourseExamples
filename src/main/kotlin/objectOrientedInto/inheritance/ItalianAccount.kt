package objectOrientedInto.inheritance

open class ItalianAccount(var region: String, balance: Double) : Account(balance) {
    init {
       region = region.toUpperCase()
    }

    constructor(region: String) : this(region, 100.0) {

    }

    override fun deposit(amount: Double) {
        println("deposit in Italian")
        // super.deposit(amount)
        balance += .9 * amount
    }

}