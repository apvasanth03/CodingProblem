package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.util.toTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class BinaryTreeLevelOrderTraversalTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(
                    arrayOf(3, 9, 20, null, null, 15, 7),
                    listOf(
                        listOf(3),
                        listOf(9, 20),
                        listOf(15, 7)
                    )
                )
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test binary tree level order traversal`(arr: Array<Int?>, expectedResult: List<List<Int>>) {
        val root = arr.toTree()

        val result = binaryTreeLevelOrderTraversal(root)

        assertThat(result).isEqualTo(expectedResult)
    }
}