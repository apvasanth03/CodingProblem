package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Remove Duplicates from Sorted Array.
 *
 * @see [Link to question](https://github.com/apvasanth03/CodingProblem/documentation/leetcode/topquestions/easy/array/remove_duplicates_from_sorted_array)
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
