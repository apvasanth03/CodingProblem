package com.vasanth.codingproblem.otherquestions

import kotlin.math.ceil
import kotlin.math.log2

/**
 * Cumulative Frequency of Data Classes
 */
fun cumulativeFrequencyOfDataClasses(arr: IntArray): IntArray {
    val n = arr.size

    // Find the range (min - max)
    var min = arr[0]
    var max = arr[0]
    var i = 1
    while (i < n) {
        val element = arr[i]
        if (element < min) {
            min = element
        }
        if (element > max) {
            max = element
        }
        i++
    }

    // Calculate range length.
    val rangeLength = (max - min) + 1

    // Calculate number of data classes 'k'
    var k = ceil(log2(n.toDouble())).toInt()
    while (true) {
        if ((rangeLength % k) == 0) {
            break
        } else {
            k += 1
        }
    }

    // Calculate Range Width.
    val rangeWidth = (rangeLength / k)

    // Form Sub-Range.
    val subRanges = Array<MutableList<Int>>(k) { mutableListOf() }
    for (element in arr) {
        val subRangeIndex = ((element - min) / rangeWidth)
        val subRange = subRanges[subRangeIndex]
        subRange.add(element)
    }

    // Calculate Result.
    val result = Array(k) { -1 }
    var cumulativeResult = 0
    i = 0
    while (i < subRanges.size) {
        val subRange = subRanges[i]
        cumulativeResult += subRange.size
        result[i] = cumulativeResult
        i++
    }
    return result.toIntArray()
}