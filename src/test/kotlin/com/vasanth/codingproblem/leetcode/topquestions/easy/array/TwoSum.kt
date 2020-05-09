package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class TwoSum {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(2, 7, 11, 15), 9, intArrayOf(0, 1))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test two sum functionality`(nums: IntArray, target: Int, expectedResult: IntArray) {
        val result = twoSum(nums, target)

        assertThat(result).isEqualTo(expectedResult)
    }
}