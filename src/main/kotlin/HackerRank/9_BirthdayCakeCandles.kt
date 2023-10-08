package HackerRank

fun main() {
    println(birthdayCakeCandles(arrayOf(3, 2, 1, 3)))
}

// fun birthdayCakeCandles(candles: Array<Int>): Int = candles.count{it == candles.max()}
// Why did the above code give a timeout error?

/*
fun birthdayCakeCandles(candles: Array<Int>): Int {
    val max = candles.max()
    return candles.count { it == max }
}
*/

fun birthdayCakeCandles(candles: Array<Int>) = candles.max().let { max -> candles.count{it == max} }