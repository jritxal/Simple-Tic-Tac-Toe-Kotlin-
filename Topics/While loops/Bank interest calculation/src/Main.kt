fun findYears(depo: Double): Int {
    var deposit = depo
    var years = 0
    val max = 700000
    val interestRate = 1.071
    do {
        deposit *= interestRate
        years++
    } while (deposit < max)

    return years
}
