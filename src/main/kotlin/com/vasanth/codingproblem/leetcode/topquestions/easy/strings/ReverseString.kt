package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * Reverse String.
 */
fun reverseString(s: CharArray) {
    var frontPtr = 0
    var rearPtr = s.size - 1

    while (frontPtr < rearPtr) {
        val temp = s[frontPtr]
        s[frontPtr] = s[rearPtr]
        s[rearPtr] = temp

        frontPtr++
        rearPtr--
    }
}
