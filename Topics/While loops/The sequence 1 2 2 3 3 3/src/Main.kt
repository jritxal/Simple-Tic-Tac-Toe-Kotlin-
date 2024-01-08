fun main() {
    val input = readln().toInt()
    var i = 0
    var numberToPrint = 1
    var times = 0

    while (i < input) {
        print("$numberToPrint ")
        times++
        if (numberToPrint == times) {
            numberToPrint++
            times = 0
        }
        i++
    }
}