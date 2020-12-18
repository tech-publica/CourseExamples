package objectOrientedInto.basic


fun main() {
    val a1 = Account(100.0)
    println(a1.balance)
    a1.balance += 50.0
    println(a1.balance)

    val a2 = Account(100.0)
    println(a2.balance)
    a2.deposit(1000.0)
    println(a2.balance)
    a2.withdraw(1000.0)
    println(a2.balance)

    a2.transfer(100.0, a1)
    println(a1.balance)
    println(a2.balance)

}
