fun main() {
    // write your code here
    val vowels = "aeiouy"

    val input = readln()

    var counter = 0
    var isVowel = false
    var isFirst = true
    var output = 0

    for (c in input) {
        if (isFirst) {
            isVowel = vowels.contains(c)
            isFirst = false
            counter++
        } else {
            if (vowels.contains(c) && isVowel) {
                counter++
            } else if (!vowels.contains(c) && !isVowel) {
                counter++
            } else {
                counter = 1
                isVowel = vowels.contains(c)
            }
            if (counter == 3) {
                output++
                counter = 1
            }
        }
    }
    println(output)
}