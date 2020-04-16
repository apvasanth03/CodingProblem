package com.vasanth.codingproblem.essentialquestions.string

/**
 * First Unique Character in a String.
 */
fun firstUniqueCharacterInAString(str: String): Int {
    val charCountMap = mutableMapOf<Char, Int>()
    for (char in str) {
        charCountMap[char] = charCountMap[char]?.let { it + 1 } ?: 1
    }

    var uniqueCharacterIndex = -1
    for ((index, char) in str.withIndex()) {
        if (charCountMap[char] == 1) {
            uniqueCharacterIndex = index
            break
        }
    }

    return uniqueCharacterIndex
}
