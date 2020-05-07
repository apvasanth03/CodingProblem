package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import java.util.*

/**
 * Plus One.
 */
@SuppressWarnings("MagicNumber")
fun plusOne(digits: IntArray): IntArray {
    val plusOneDigits = LinkedList<Int>()
    var sumDigit = 1
    for (index in digits.size - 1 downTo 0) {
        val sum = digits[index] + sumDigit
        plusOneDigits.addFirst(sum % 10)
        sumDigit = sum / 10
    }

    if (sumDigit > 0) {
        plusOneDigits.addFirst(sumDigit)
    }

    return plusOneDigits.toIntArray()
}
