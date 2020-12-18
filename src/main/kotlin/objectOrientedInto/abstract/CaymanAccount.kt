package objectOrientedInto.abstract

class CaymanAccount(var secretCode: String, balance: Double) : Account(balance) {

    override fun deposit(amount: Double) {
        println("deposit in Cayman")
        // super.deposit(amount)
        balance += 1.1 * amount
    }

    override fun toString(): String {
        return "${this.javaClass.simpleName}, balance: $balance"
    }
}