package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PlusOneTest {

    companion object {

        @JvmStatic
        fun provideTestDate(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 2, 3), intArrayOf(1, 2, 4)),
                arguments(intArrayOf(4, 3, 2, 1), intArrayOf(4, 3, 2, 2)),
                arguments(intArrayOf(9, 9, 9), intArrayOf(1, 0, 0, 0)),
                arguments(intArrayOf(9,8,7,6,5,4,3,2,1,0), intArrayOf(9,8,7,6,5,4,3,2,1,1))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestDate")
    fun `test plus one functionality`(digits: IntArray, expectedResult: IntArray) {
        val result = plusOne(digits)

        assertThat(result).isEqualTo(expectedResult)
    }
}