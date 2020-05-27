package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.util.toTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidateBinarySearchTreeTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(arrayOf(2, 1, 3), true),
                arguments(arrayOf(5, 1, 4, null, null, 3, 6), false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test validate binary search tree`(arr: Array<Int?>, expectedResult: Boolean) {
        val root = arr.toTree()

        val result = validateBinarySearchTree(root)

        assertThat(result).isEqualTo(expectedResult)
    }
}