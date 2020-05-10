package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidPalindromeTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("A man, a plan, a canal: Panama", true),
                arguments("race a car", false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test valid palindrome functionality`(s: String, expectedResult: Boolean) {
        val result = validPalindrome(s)

        assertThat(result).isEqualTo(expectedResult)
    }
}