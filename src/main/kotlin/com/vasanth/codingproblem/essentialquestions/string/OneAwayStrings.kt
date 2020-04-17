package com.vasanth.codingproblem.essentialquestions.string

import kotlin.math.abs

/**
 * One Away Strings.
 */
fun oneAwayStrings(str1: String, str2: String): Boolean {
    return when {
        abs(str1.length - str2.length) > 1 -> {
            false
        }

        str1.length == str2.length -> {
            isOneStringAwaySameLength(str1, str2)
        }

        str1.length > str2.length -> {
            isOneStringAwayDiffLength(str1, str2)
        }

        else -> {
            isOneStringAwayDiffLength(str2, str1)
        }
    }
}

// str1.length = str2.length
private fun isOneStringAwaySameLength(str1: String, str2: String): Boolean {
    var diffCount = 0
    for (index in str1.indices) {
        if (str1[index] != str2[index]) {
            diffCount++
            if (diffCount > 1) {
                return false
            }
        }
    }
    return true
}

// str1.length = str2.length + 1
private fun isOneStringAwayDiffLength(str1: String, str2: String): Boolean {
    var diffCount = 0
    var ptr2 = 0
    while (ptr2 < str2.length) {
        if (str1[ptr2 + diffCount] == str2[ptr2]) {
            ptr2++
        } else {
            diffCount++
            if (diffCount > 1) {
                return false
            }
        }
    }
    return true
}
