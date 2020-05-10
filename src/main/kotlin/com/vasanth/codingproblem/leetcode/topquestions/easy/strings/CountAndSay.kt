package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * Count and Say.
 */
fun countAndSay(n: Int): String {
    var sequence = "1"

    if (n == 1) {
        return sequence
    }

    for (i in 2..n) {
        var value = sequence[0]
        var freq = 1
        val sequenceBuilder = StringBuilder()
        var j = 1
        while (j < sequence.length) {
            if (sequence[j] == value) {
                freq++
            } else {
                sequenceBuilder.append(freq).append(value)
                value = sequence[j]
                freq = 1
            }
            j++
        }
        sequenceBuilder.append(freq).append(value)
        sequence = sequenceBuilder.toString()
    }

    return sequence
}
