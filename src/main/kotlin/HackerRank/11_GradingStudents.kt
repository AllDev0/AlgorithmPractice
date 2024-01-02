package HackerRank

fun main() {
    gradingStudents(arrayOf(73, 67, 38, 33, 84, 29, 57)).forEach {
        println(it)
    }
}

fun gradingStudents(grades: Array<Int>): Array<Int> {
    grades.mapIndexed { index, value ->
        if (value >= 38) {
            if (grades[index] % 5 >= 3) {
                grades[index] = value + (5 - value % 5)
            }
        }
    }

    return grades
}