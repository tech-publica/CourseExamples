package objectOrientedInto.inheritance

import objectOrientedInto.basic.Account

open class Account(var balance : Double) {

    open fun deposit(amount : Double) {
        println("deposit in General")
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