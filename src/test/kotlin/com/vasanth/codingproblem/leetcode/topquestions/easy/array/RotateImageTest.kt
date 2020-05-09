package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RotateImageTest {

    companion object {

        @JvmStatic
        fun provideTestDate(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    arrayOf(
                        intArrayOf(1, 2, 3),
                        intArrayOf(4, 5, 6),
                        intArrayOf(7, 8, 9)
                    ),
                    arrayOf(
                        intArrayOf(7, 4, 1),
                        intArrayOf(8, 5, 2),
                        intArrayOf(9, 6, 3)
                    )
                ),
                arguments(
                    arrayOf(
                        intArrayOf(5, 1, 9, 11),
                        intArrayOf(2, 4, 8, 10),
                        intArrayOf(13, 3, 6, 7),
                        intArrayOf(15, 14, 12, 16)
                    ),
                    arrayOf(
                        intArrayOf(15, 13, 2, 5),
                        intArrayOf(14, 3, 4, 1),
                        intArrayOf(12, 6, 8, 9),
                        intArrayOf(16, 7, 10, 11)
                    )
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestDate")
    fun `test rotate image functionality`(matrix: Array<IntArray>, expectedResult: Array<IntArray>) {
        rotateImage(matrix)

        assertThat(matrix).isEqualTo(expectedResult)
    }
}