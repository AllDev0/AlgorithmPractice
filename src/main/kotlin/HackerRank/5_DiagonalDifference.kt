package HackerRank

fun main() {

    println(diagonalDifference(arrayOf(arrayOf(1, 2, 3), arrayOf(4, 5, 6), arrayOf(9, 8, 9))))
}

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    var d1 = 0
    var d2 = 0

    for (i in 0..arr.lastIndex){
        d1 += arr[i][i]
        d2 += arr[i][arr.lastIndex-i]
    }

    return Math.abs(d1 - d2)
}