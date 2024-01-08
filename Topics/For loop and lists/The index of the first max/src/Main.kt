fun main() {
    // write your code here
    val size = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 0 until size) {
        list.add(readln().toInt())
    }
    print(list.indexOf(list.maxOrNull()))
}