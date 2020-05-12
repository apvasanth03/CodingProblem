package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toArray
import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toLinkedList
import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ReverseLinkedListTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 2, 3, 4, 5), intArrayOf(5, 4, 3, 2, 1))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test reverse linked list functionality`(list: IntArray, expectedResult: IntArray) {
        val head = list.toLinkedList()!!
        val result = reverseLinkedList(head)

        Assertions.assertThat(result?.toArray()).isEqualTo(expectedResult)
    }
}