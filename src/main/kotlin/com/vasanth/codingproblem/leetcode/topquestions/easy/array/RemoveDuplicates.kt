package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Remove Duplicates from Sorted Array.
 */
fun removeDuplicates(nums: IntArray): Int {
    if (nums.isEmpty()) {
        return 0
    }

    var uniqueIndex = 0
    var index = 1;
    while (index < nums.size) {
        if (nums[uniqueIndex] != nums[index]) {
            uniqueIndex++
            nums[uniqueIndex] = nums[index]
        }
        index++
    }

    return (uniqueIndex + 1)
}
