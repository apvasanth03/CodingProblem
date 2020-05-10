package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * Valid Palindrome.
 */
@SuppressWarnings("LoopWithTooManyJumpStatements")
fun validPalindrome(s: String): Boolean {
    var frontPtr = 0
    var rearPtr = s.length - 1

    while (frontPtr < rearPtr) {
        val frontChar = s[frontPtr]
        val rearChar = s[rearPtr]

        if (!frontChar.isLetterOrDigit()) {
            frontPtr++
            continue
        }

        if (!rearChar.isLetterOrDigit()) {
            rearPtr--
            continue
        }

        if (!s[frontPtr].equals(s[rearPtr], ignoreCase = true)) {
            return false
        }

        frontPtr++
        rearPtr--
    }

    return true
}
