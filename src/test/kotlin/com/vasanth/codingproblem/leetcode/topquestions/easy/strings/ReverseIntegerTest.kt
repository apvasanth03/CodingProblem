package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ReverseIntegerTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(123, 321),
                arguments(-123, -321),
                arguments(120, 21)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test reverse integer functionality`(x: Int, expectedResult: Int) {
        val result = reverseInteger(x)

        assertThat(result).isEqualTo(expectedResult)
    }
}