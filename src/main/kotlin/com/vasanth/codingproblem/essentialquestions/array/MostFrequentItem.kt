package com.vasanth.codingproblem.essentialquestions.array

/**
 * Most frequently occurring item in an array.
 */
fun mostFrequentlyOccurringItem(array: IntArray): Int? {
    var maxItem: Int? = null

    val itemCountMap = mutableMapOf<Int, Int>()
    for (item in array) {
        val itemCount = itemCountMap[item]?.let { it + 1 } ?: 1
        itemCountMap[item] = itemCount

        val maxItemCount = itemCountMap[maxItem]
        if (maxItemCount == null || itemCount > maxItemCount) {
            maxItem = item
        }
    }

    return maxItem
}
