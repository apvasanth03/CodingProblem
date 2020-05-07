package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Contains Duplicate.
 */
fun containsDuplicate(nums: IntArray): Boolean {
    val numSet = HashSet<Int>()
    for (item in nums) {
        if (numSet.contains(item)) {
            return true
        }
        numSet.add(item)
    }
    return false
}
