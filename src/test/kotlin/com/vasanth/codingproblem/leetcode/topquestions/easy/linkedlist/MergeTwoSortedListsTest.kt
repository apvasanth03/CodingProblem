package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toArray
import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class MergeTwoSortedListsTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.arguments(intArrayOf(1, 2, 4), intArrayOf(1, 3, 4), intArrayOf(1, 1, 2, 3, 4, 4))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test merge two sorted lists functionality`(l1: IntArray, l2: IntArray, expectedList: IntArray) {
        val list1 = l1.toLinkedList()!!
        val list2 = l2.toLinkedList()!!
        val result = mergeTwoSortedLists(list1, list2)

        assertThat(result?.toArray()).isEqualTo(expectedList)
    }
}