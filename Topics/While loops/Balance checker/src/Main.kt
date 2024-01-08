import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    var balance = readln().toInt()
    while (scanner.hasNextInt()) {
        val item = scanner.next().toInt()
        if (balance - item < 0) {
            println("Error, insufficient funds for the purchase. Your balance is $balance, but you need $item.")
        }
        balance -= item
    }
    if (balance >= 0) {
        println("Thank you for choosing us to manage your account! Your balance is $balance.")
    }

}