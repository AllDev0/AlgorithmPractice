package HackerRank

fun main() {
    staircase(6)
}

fun staircase(n: Int): Unit {
    for (x in 1..n){
        print(" ".repeat(n-x))
        print("#".repeat(x))
        println()
    }
}