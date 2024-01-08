fun main() {
    // write your code here
    val url = readln()
    val params = url.substring(url.indexOf("?") + 1).split("&")
    var password = ""
    for (param in params) {
        val paramList = param.split("=")
        println("${paramList[0]} : ${paramList[1].ifEmpty { "not found" }}")
        if (paramList[0] == "pass") {
            password = paramList[1]
        }
    }
    if (password.length > 0) {
        println("password : $password")
    }
}