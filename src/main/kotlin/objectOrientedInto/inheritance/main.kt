package objectOrientedInto.inheritance

fun main() {
    val it1 = ItalianAccount("liguria", 1000.0)
    val it2 : Account = ItalianAccount("puglia", 2000.0)
    it1.deposit(100.0)
    it2.deposit((100.0))
}