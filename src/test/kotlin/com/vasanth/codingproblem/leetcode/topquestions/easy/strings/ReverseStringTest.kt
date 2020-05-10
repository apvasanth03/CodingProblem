package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ReverseStringTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    charArrayOf('h', 'e', 'l', 'l', 'o'),
                    charArrayOf('o', 'l', 'l', 'e', 'h')
                ),
                arguments(
                    charArrayOf('H', 'a', 'n', 'n', 'a', 'h'),
                    charArrayOf('h', 'a', 'n', 'n', 'a', 'H')
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test reverse string functionality`(s: CharArray, expectedResult: CharArray) {
        reverseString(s)

        assertThat(s).isEqualTo(expectedResult)
    }
}