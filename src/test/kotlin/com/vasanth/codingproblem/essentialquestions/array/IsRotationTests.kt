package com.vasanth.codingproblem.essentialquestions.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IsRotationTests {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(4, 5, 6, 7, 8, 1, 2, 3),
                    false
                ),
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(4, 5, 6, 7, 1, 2, 3),
                    true
                ),
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(4, 5, 6, 9, 1, 2, 3),
                    false
                ),
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(4, 6, 5, 7, 1, 2, 3),
                    false
                ),
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(4, 5, 6, 7, 0, 2, 3),
                    false
                ),
                arguments(
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    intArrayOf(1, 2, 3, 4, 5, 6, 7),
                    true
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test is one array rotation of another functionality`(
        arr1: IntArray,
        arr2: IntArray,
        expectedResult: Boolean
    ) {
        val result = isOneArrayARotationOfAnother(arr1, arr2)

        assertThat(result).isEqualTo(expectedResult)
    }
}