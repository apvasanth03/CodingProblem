package com.vasanth.codingproblem.essentialquestions.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MostFrequentItem {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 3, 1, 3, 2, 1), 1),
                arguments(intArrayOf(3, 3, 1, 3, 2, 1), 3),
                arguments(intArrayOf(), null),
                arguments(intArrayOf(0), 0),
                arguments(intArrayOf(0, -1, 10, 10, -1, 10, -1, -1, -1, 1), -1)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test most frequently occurring item in an array functionality`(input: IntArray, expectedResult: Int?) {
        val result = mostFrequentlyOccurringItem(input)

        assertThat(result).isEqualTo(expectedResult)
    }
}