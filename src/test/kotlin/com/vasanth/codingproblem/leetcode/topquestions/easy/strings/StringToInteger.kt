package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class StringToInteger {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("42", 42),
                arguments("   -42", -42),
                arguments("4193 with words", 4193),
                arguments("words and 987", 0),
                arguments("-91283472332", -2147483648),
                arguments("-2147483649", -2147483648)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test string to integer functionality`(str: String, expectedResult: Int) {
        val result = stringToInteger(str)

        assertThat(result).isEqualTo(expectedResult)
    }
}