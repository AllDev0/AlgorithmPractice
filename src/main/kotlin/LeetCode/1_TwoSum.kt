package LeetCode

// https://leetcode.com/problems/two-sum/

fun main(){
    //val nums = intArrayOf(2, 7, 11, 15)
    //val target = 9

    //val nums = intArrayOf(3, 2, 4)
    //val target = 6

    val nums = intArrayOf(3, 3)
    val target = 6

    val result = twoSum(nums, target)
    println(result.joinToString())
}

fun twoSum(nums: IntArray, target: Int): IntArray{
    var firstIndex = 0
    var secondIndex = 1
    for (i: Int in 0..nums.size-1){
        for (j in i+1..nums.size-1){
            if (nums[i] + nums[j] == target){
                firstIndex = i
                secondIndex = j
                break
            }
        }
    }

    return intArrayOf(firstIndex, secondIndex)
}