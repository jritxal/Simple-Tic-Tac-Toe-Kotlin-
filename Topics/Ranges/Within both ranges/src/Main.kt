fun main() {
    // write your code here
    val min1 = readln().toInt()
    val max1 = readln().toInt()
    val min2 = readln().toInt()
    val max2 = readln().toInt()
    val value = readln().toInt()
    println(value in min1..max1 && value in min2..max2)
}