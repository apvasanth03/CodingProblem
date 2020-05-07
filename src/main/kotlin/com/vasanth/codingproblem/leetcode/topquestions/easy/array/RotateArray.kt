package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Rotate Array.
 */
fun rotateArray(nums: IntArray, k: Int) {
    val tempRotatedNums = Array(nums.size) { -1 }
    for (index in nums.indices) {
        val rotatedIndex = (index + k) % nums.size
        tempRotatedNums[rotatedIndex] = nums[index]
    }

    for (index in nums.indices) {
        nums[index] = tempRotatedNums[index]
    }
}
