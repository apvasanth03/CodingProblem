package com.vasanth.codingproblem.essentialquestions.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CommonElements {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    intArrayOf(1, 3, 4, 6, 7, 9),
                    intArrayOf(1, 2, 4, 5, 9, 10),
                    intArrayOf(1, 4, 9)
                ),
                arguments(
                    intArrayOf(1, 2, 9, 10, 11, 12),
                    intArrayOf(0, 1, 2, 3, 4, 5, 8, 9, 10, 12, 14, 15),
                    intArrayOf(1, 2, 9, 10, 12)
                ),
                arguments(
                    intArrayOf(0, 1, 2, 3, 4, 5),
                    intArrayOf(6, 7, 8, 9, 10, 11),
                    intArrayOf()
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test common elements in two sorted array functionality`(
        arr1: IntArray,
        arr2: IntArray,
        expectedResult: IntArray
    ) {
        val result = commonElementsInTwoSortedArrays(arr1, arr2)

        assertThat(result).isEqualTo(expectedResult)
    }
}