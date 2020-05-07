package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MoveZeroes {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(0, 1, 0, 3, 12), intArrayOf(1, 3, 12, 0, 0))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test move zeroes functionality`(nums: IntArray, expectedResult: IntArray) {
        moveZeroes(nums)

        assertThat(nums).isEqualTo(expectedResult)
    }
}