package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RemoveDuplicatesTest {

    @Test
    fun `given numbers with duplicates`() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)

        val result = removeDuplicates(nums)

        assertThat(result).isEqualTo(5)
        assertThat(nums.sliceArray(0 until result)).isEqualTo(intArrayOf(0, 1, 2, 3, 4))
    }

    @Test
    fun `given numbers without duplicates`() {
        val nums = intArrayOf(1, 2, 3, 4, 5)

        val result = removeDuplicates(nums)

        assertThat(result).isEqualTo(5)
        assertThat(nums.sliceArray(0 until result)).isEqualTo(nums)
    }
}