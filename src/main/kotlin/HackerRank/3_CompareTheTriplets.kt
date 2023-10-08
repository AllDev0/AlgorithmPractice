package HackerRank

fun main() {
    val a = arrayOf(9, 8, 7)
    val b =  arrayOf(7, 8, 9)
    println(compareTriplets(a,b).joinToString(" "))
}

fun compareTriplets(a: Array<Int>, b: Array<Int>): Array<Int> {
    var aScore = 0
    var bScore = 0

    val size = a.size
    for (index in 0..size-1) {
        if (a[index] > b[index])
            aScore++
        else if (b[index] > a[index])
            bScore++
    }

    return arrayOf(aScore, bScore)
}