package objectOrientedInto.abstract

import objectOrientedInto.basic.Account

abstract class Account(var balance : Double) {

    abstract fun deposit(amount : Double)

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