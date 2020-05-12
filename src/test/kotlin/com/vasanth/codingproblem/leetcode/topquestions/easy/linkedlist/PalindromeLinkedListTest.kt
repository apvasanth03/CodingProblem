package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util.toLinkedList
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class PalindromeLinkedListTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 2), false),
                arguments(intArrayOf(1, 2, 2, 1), true)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test is palindrome linked list functionality`(list: IntArray, expectedResult: Boolean) {
        val head = list.toLinkedList()

        val result = isPalindrome(head)

        assertThat(result).isEqualTo(expectedResult)
    }
}