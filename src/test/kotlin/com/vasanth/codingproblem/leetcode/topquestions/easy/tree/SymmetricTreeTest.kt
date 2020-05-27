package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.util.toTree
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SymmetricTreeTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(arrayOf(1, 2, 2, 3, 4, 4, 3), true),
                arguments(arrayOf(1, 2, 2, null, 3, null, 3), false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test is symmetric tree`(arr: Array<Int?>, expectedResult: Boolean) {
        val root = arr.toTree()

        val result = isSymmetricTree(root)

        assertThat(result).isEqualTo(expectedResult)
    }
}