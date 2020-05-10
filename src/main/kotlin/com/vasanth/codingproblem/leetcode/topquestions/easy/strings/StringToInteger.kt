package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

/**
 * String to Integer.
 */
@SuppressWarnings("LoopWithTooManyJumpStatements", "MagicNumber", "ComplexMethod")
fun stringToInteger(str: String): Int {
    var ptr = 0

    // Move ptr to first non space character
    while (ptr < str.length && str[ptr] == ' ') {
        ptr++
    }

    // Check for initial sign
    var initialSign: Char? = null
    if ((ptr < str.length) && (str[ptr] == '+' || str[ptr] == '-')) {
        initialSign = str[ptr]
        ptr++
    }

    var num = 0
    while (ptr < str.length) {
        val char = str[ptr]

        if (!char.isDigit()) {
            break
        }

        val digit = (char - '0') * (if (initialSign == '-') -1 else +1)

        if ((num > Int.MAX_VALUE / 10) || (num == Int.MAX_VALUE / 10 && digit > 7)) {
            num = Int.MAX_VALUE
            break
        }
        if ((num < Int.MIN_VALUE / 10) || (num == Int.MIN_VALUE / 10 && digit < -8)) {
            num = Int.MIN_VALUE
            break
        }

        num = (num * 10) + digit

        ptr++
    }

    return num
}
