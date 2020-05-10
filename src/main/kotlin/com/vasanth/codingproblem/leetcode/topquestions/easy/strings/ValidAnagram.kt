package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * Valid Anagram.
 */
@SuppressWarnings("ReturnCount")
fun validAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) {
        return false
    }

    val charCountMap = HashMap<Char, Int>()

    for (char in s) {
        charCountMap[char] = charCountMap.getOrDefault(char, 0) + 1
    }

    for (char in t) {
        val charCount: Int = charCountMap[char] ?: return false

        if (charCount == 1) {
            charCountMap.remove(char)
        } else {
            charCountMap[char] = charCount - 1
        }
    }

    return true
}
