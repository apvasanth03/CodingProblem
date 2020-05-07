package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Intersection of Two Arrays.
 */
fun intersectionOfTwoArrays(nums1: IntArray, nums2: IntArray): IntArray {
    val numMap = HashMap<Int, Int>()
    for (item in nums1) {
        numMap[item] = numMap.getOrDefault(item, 0) + 1
    }

    val intersectionList = mutableListOf<Int>()
    for (item in nums2) {
        if (numMap.containsKey(item) && numMap.getValue(item) > 0) {
            intersectionList.add(item)
            numMap[item] = numMap.getValue(item) - 1
        }
    }

    return intersectionList.toIntArray()
}
