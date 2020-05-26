package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode
import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LinkedListCycleTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(3, 2, 0, -4), 1, true),
                arguments(intArrayOf(1, 2), 0, true),
                arguments(intArrayOf(1), -1, false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test has linked list cycle functionality`(list: IntArray, pos: Int, expectedResult: Boolean) {
        val head = list.toLinkedList()

        if (pos != -1) {
            lateinit var circularNode: ListNode
            var temp = head!!
            var i = 0
            while (temp.next != null) {
                if (i == pos) {
                    circularNode = temp
                }
                temp = temp.next!!
                i++
            }
            temp.next = circularNode
        }

        val result = hasLinkedListCycle(head)

        assertThat(result).isEqualTo(expectedResult)
    }
}