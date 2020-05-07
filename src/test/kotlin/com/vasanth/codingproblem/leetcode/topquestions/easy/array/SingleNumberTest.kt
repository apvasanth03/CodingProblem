package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SingleNumberTest {

    companion object {

        @JvmStatic
        fun provideTestDate(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(2, 2, 1), 1),
                arguments(intArrayOf(4, 1, 2, 1, 2), 4)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestDate")
    fun `test single number functionality`(nums: IntArray, expectedResult: Int) {
        val result = singleNumber(nums)

        assertThat(result).isEqualTo(expectedResult)
    }
}