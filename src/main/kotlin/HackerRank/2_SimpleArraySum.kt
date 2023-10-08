package HackerRank

// https://www.hackerrank.com/challenges/simple-array-sum/problem?isFullScreen=true

fun main() {
    println(simpleArraySum(arrayOf(1, 2, 3, 4, 10, 11)))
}

fun simpleArraySum(ar: Array<Int>): Int = ar.sum()