package HackerRank

fun main() {
    miniMaxSum(arrayOf(1, 3, 5, 7, 9))
}

fun miniMaxSum(arr: Array<Int>): Unit {
    val mutableList: MutableList<Long> = mutableListOf()
    arr.forEach{mutableList.add(it.toLong())}

    val minSum = mutableList.sum() - mutableList.max()
    val maxSum = mutableList.sum() - mutableList.min()

    println("$minSum $maxSum")
}