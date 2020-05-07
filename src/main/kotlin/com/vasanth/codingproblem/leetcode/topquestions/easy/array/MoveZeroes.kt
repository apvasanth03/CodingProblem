package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Move Zeroes.
 */
fun moveZeroes(nums: IntArray) {
    var ptr = 0
    var nonZeroPtr = 0

    while (ptr < nums.size) {
        if (nums[ptr] != 0) {
            if (ptr != nonZeroPtr) {
                val temp = nums[nonZeroPtr]
                nums[nonZeroPtr] = nums[ptr]
                nums[ptr] = temp
            }
            nonZeroPtr++
        }
        ptr++
    }
}
