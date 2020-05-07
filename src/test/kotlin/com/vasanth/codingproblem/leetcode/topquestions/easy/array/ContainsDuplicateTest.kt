package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ContainsDuplicateTest {

    companion object {

        @JvmStatic
        fun provideTestDate(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    intArrayOf(1, 2, 3, 1), true,
                    intArrayOf(1, 2, 3, 4), false,
                    intArrayOf(1, 1, 1, 3, 3, 4, 3, 2, 4, 2), true
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestDate")
    fun `test contains duplicate functionality`(nums: IntArray, expectedResult: Boolean) {
        val result = containsDuplicate(nums)

        assertThat(result).isEqualTo(expectedResult)
    }
}