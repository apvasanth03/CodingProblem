package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * Reverse Integer.
 */
@SuppressWarnings("MagicNumber", "ReturnCount")
fun reverseInteger(x: Int): Int {
    var num = x
    var rev = 0
    while (num != 0) {
        val pop = num % 10

        if ((rev > Int.MAX_VALUE / 10) || (rev == Int.MAX_VALUE && pop > 7)) {
            return 0
        }
        if ((rev < Int.MIN_VALUE / 10) || (rev == Int.MIN_VALUE && pop < -8)) {
            return 0
        }

        rev = (rev * 10) + pop
        num /= 10
    }
    return rev
}
