package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class DeleteNodeTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(4, 5, 1, 9), 5, intArrayOf(4, 1, 9)),
                arguments(intArrayOf(4, 5, 1, 9), 1, intArrayOf(4, 5, 9))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test delete node functionality`(list: IntArray, deleteVal: Int, expectedResult: IntArray) {
        lateinit var head: ListNode
        lateinit var nodeToDelete: ListNode
        var prev: ListNode? = null
        for (num in list) {
            val node = ListNode(num)
            if (prev == null) {
                head = node
            } else {
                prev.next = node
            }
            prev = node

            if (num == deleteVal) {
                nodeToDelete = node
            }
        }

        deleteNode(nodeToDelete)

        val result = mutableListOf<Int>()
        var temp: ListNode? = head
        while (temp != null) {
            result.add(temp.`val`)
            temp = temp.next
        }
        assertThat(result.toIntArray()).isEqualTo(expectedResult)
    }
}