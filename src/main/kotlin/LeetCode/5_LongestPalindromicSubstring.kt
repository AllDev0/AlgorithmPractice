package LeetCode

fun main() {
    //println(longestPalindrome("a"))
    //println(longestPalindrome("babad"))
    //println(longestPalindrome("cbbd"))
    //println(longestPalindrome("wcqdyulxbzrabuvjjouvlmbzsfpcykmmusxdgrrirljrltlnswqqgyukxjfhzhbpipkswzqroarikxtrlzjriyivdjydlfopqnbqlwiperuaeszhthcunyqejayftrlwiucvlghkurgmnlixfoaokgvucdgzscjkwleifdkjycrgwidibldabhsquotljtvjxitfyrvvwlzxavvgjkmtxswxhutxgeaajuycqpxjraxgsixtmncwauubigsxdjzmgpdwvfztuzsxwyiwjeuzapjmbpfhcdzptmcphjtzdwdlpzzqnomamykbxmsbirtxjqfylatgzzelunzgomohgmlirxkgxregmbhwpoovormmvfrhqoovewpwukfdfxlmqdcvkvjueqrkmsgraexfhdstjaxqxwfbhbuvbnyxckefikkyblrfdrsdgyjckhblycffuqfsrlsenyluxepmscukwruipanugiakyrmmvrcjsgyprrke"))
    println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"))
}

fun longestPalindrome(str: String): String {
    if (str.length <= 1) return str

    var palindromicString = ""
    val isPalindromeMatrix = Array(str.length) { BooleanArray(str.length) }

    for (length in 1..str.length) {
        for (i in 0 until str.length - length + 1) {
            val j = i + length - 1
            if (str[i] == str[j] && (length <= 2 || isPalindromeMatrix[i + 1][j - 1])) {
                isPalindromeMatrix[i][j] = true

                if (length > palindromicString.length) {
                    palindromicString = str.substring(i, j + 1)
                }
            }
        }
    }

    return palindromicString
}
