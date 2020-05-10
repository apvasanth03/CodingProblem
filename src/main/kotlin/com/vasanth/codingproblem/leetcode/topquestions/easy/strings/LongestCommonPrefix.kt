package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

fun longestCommonPrefix(strs: Array<String>): String {
    if (strs.isEmpty()) {
        return ""
    }

    val commonPrefix = StringBuilder()
    val firstStr = strs[0]
    outerLoop@ for (i in firstStr.indices) {
        for (j in 1 until strs.size) {
            val str = strs[j]
            if (i >= str.length || firstStr[i] != str[i]) {
                break@outerLoop
            }
        }
        commonPrefix.append(firstStr[i])
    }

    return commonPrefix.toString()
}
