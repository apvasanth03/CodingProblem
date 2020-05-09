package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidateSudokuTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    arrayOf(
                        charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.'),
                        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                    ),
                    true
                ),
                arguments(
                    arrayOf(
                        charArrayOf('8', '3', '.', '.', '7', '.', '.', '.', '.'),
                        charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.'),
                        charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.'),
                        charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3'),
                        charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1'),
                        charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6'),
                        charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.'),
                        charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5'),
                        charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')
                    ),
                    false
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test validate sudoku functionality`(board: Array<CharArray>, expectedResult: Boolean) {
        val result = validateSudoku(board)

        assertThat(result).isEqualTo(expectedResult)
    }
}