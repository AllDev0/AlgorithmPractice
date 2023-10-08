package HackerRank

fun main() {
    plusMinus(arrayOf(-3, -2, -1, 0, 1, 2, 3))
}

fun plusMinus(arr: Array<Int>): Unit {
    val positiveCounter = arr.count{ it > 0 }.toDouble()
    val negativeCounter = arr.count{ it < 0 }.toDouble()
    val zeroCounter = arr.count { it == 0 }.toDouble()

    println(positiveCounter / arr.size)
    println(negativeCounter / arr.size)
    println(zeroCounter / arr.size)
}