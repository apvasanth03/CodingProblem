package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toArray
import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class RemoveNthNodeFromEndOfListTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 2, 3, 4, 5), 5, intArrayOf(2, 3, 4, 5)),
                arguments(intArrayOf(1, 2, 3, 4, 5), 2, intArrayOf(1, 2, 3, 5)),
                arguments(intArrayOf(1, 2, 3, 4, 5), 1, intArrayOf(1, 2, 3, 4))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test remove Nth node from end of list functionality`(list: IntArray, n: Int, expectedResult: IntArray) {
        val head = list.toLinkedList()!!
        val result = removeNthNodeFromEndOfList(head, n)

        assertThat(result?.toArray()).isEqualTo(expectedResult)
    }
}