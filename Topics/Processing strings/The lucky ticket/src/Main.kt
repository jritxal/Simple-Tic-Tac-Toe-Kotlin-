fun main() {
    // write your code here
    val ticket = readln()
    println(
        if (ticket[0].digitToInt() + ticket[1].digitToInt() + ticket[2].digitToInt() ==
            ticket[3].digitToInt() + ticket[4].digitToInt() + ticket[5].digitToInt()
        ) {
            "Lucky"
        } else "Regular"
    )
}