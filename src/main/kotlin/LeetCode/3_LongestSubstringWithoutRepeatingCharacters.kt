package LeetCode

fun main() {
    println(lengthOfLongestSubstring("ABCDEFGAB"))
}

fun lengthOfLongestSubstring(s: String): Int {
    var max = 0
    val hashset = linkedSetOf<Char>()
    for (c in s){
        while (hashset.contains(c)){
            if (max < hashset.size){
                max = hashset.size
            }
            hashset.remove(hashset.first())
        }
        hashset.add(c)
    }
    if (max < hashset.size){
        max = hashset.size
    }

    return max
}