package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Two Sum.
 */
fun twoSum(nums: IntArray, target: Int): IntArray {
    val numIndexMap = HashMap<Int, Int>()
    for ((index, num) in nums.withIndex()) {
        val companion = target - num
        val companionIndex = numIndexMap[companion]
        if (companionIndex != null) {
            return intArrayOf(companionIndex, index)
        }
        numIndexMap[num] = index
    }

    throw IllegalArgumentException("No two sum solution")
}
