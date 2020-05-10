package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * strStr().
 */
@SuppressWarnings("ReturnCount")
fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) {
        return 0
    }

    for (i in 0..(haystack.length - needle.length)) {
        var j = 0
        while (j < needle.length) {
            if (haystack[i + j] != needle[j]) {
                break
            }
            j++
        }

        if (j == needle.length) {
            return i
        }
    }

    return -1
}
