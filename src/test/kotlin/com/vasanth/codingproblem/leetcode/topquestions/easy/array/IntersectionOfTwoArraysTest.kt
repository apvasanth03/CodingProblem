package com.vasanth.codingproblem.leetcode.topquestions.easy.array

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class IntersectionOfTwoArraysTest {

    companion object {

        @JvmStatic
        fun provideTestDate(): Stream<Arguments> {
            return Stream.of(
                arguments(intArrayOf(1, 2, 2, 1), intArrayOf(2, 2), intArrayOf(2, 2)),
                arguments(intArrayOf(4, 9, 5), intArrayOf(9, 4, 9, 8, 4), intArrayOf(4, 9))
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestDate")
    fun `test intersection of two arrays functionality`(nums1: IntArray, nums2: IntArray, expectedResult: IntArray) {
        val result = intersectionOfTwoArrays(nums1, nums2)

        assertThat(result).containsExactlyInAnyOrder(*expectedResult)
    }
}