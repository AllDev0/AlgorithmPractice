package HackerRank

fun main() {
    println(timeConversion("12:00:00AM"))
}

fun timeConversion(s: String): String {
    var hour = s.substring(0, 2).toInt()
    val middle = s.substring(2..7)
    val isAmPm = s.substring(s.length-2, s.length)

    if (hour == 12 && isAmPm == "AM"){
        hour = 0
    }

    if (hour < 12 && isAmPm == "PM"){
        hour += 12
    }

    val hourString = hour.toString().padStart(2, '0')
    return hourString + middle
}