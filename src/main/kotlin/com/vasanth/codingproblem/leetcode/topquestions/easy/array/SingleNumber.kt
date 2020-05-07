package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Single Number.
 */
fun singleNumber(nums: IntArray): Int {
    val itemCountMap = HashMap<Int, Int>()
    for (item in nums) {
        itemCountMap[item] = itemCountMap.getOrDefault(item, 0) + 1
    }

    for (item in itemCountMap.keys) {
        if (itemCountMap[item] == 1) {
            return item
        }
    }

    return -1
}
