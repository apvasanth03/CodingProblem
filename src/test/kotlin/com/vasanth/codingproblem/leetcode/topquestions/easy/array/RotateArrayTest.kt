package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RotateArrayTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    3,
                    intArrayOf(5, 6, 7, 1, 2, 3, 4)
                ),
                arguments(
                    intArrayOf(-1, -100, 3, 99),
                    2,
                    intArrayOf(3, 99, -1, -100)
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test rotate array functionality`(
        nums: IntArray,
        k: Int,
        expectedResult: IntArray
    ) {
        rotateArray(nums, k)

        assertThat(nums).isEqualTo(expectedResult)
    }
}