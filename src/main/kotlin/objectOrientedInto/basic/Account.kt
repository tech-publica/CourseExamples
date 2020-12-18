package objectOrientedInto.basic

class Account(balance: Double) {
    var balance : Double = balance
   // get() =  field
    get() {
        return field
    }
    set(value) {
        if( value >= 0) {
            field = value
        }

    }

    fun deposit(amount : Double) {
        this.balance += amount
    }

    fun withdraw(amount: Double): Boolean {
        if (amount <= balance) {
            this.balance -= amount
            return true
        }
        return false
    }

    fun transfer(amount : Double, target: Account) {
        this.withdraw(amount);
        target.deposit((amount))
    }
}