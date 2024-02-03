package LeetCode

fun main() {
    println(findMedianSortedArrays(intArrayOf(1, 2), intArrayOf(3, 4)))
}

fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val mergedNums = (intArrayOf(*nums1, *nums2)).toTypedArray()
    mergedNums.sort()
    return if(mergedNums.size % 2 == 0) ((mergedNums[mergedNums.size/2] + mergedNums[mergedNums.size/2-1]) / 2.0) else mergedNums[mergedNums.size/2].toDouble()
}