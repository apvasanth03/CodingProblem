package com.vasanth.codingproblem.set.easy

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class HasPairWithSumTest {

    @Test
    @DisplayName("Given the number which has pair with sum in the array, then should return TRUE")
    fun given_NumberHasPair_ShouldReturnTrue() {
        val arr = listOf(10, 15, 3, 7)
        val k = 17

        val result = hasPairWithSum(arr, k)

        assertThat(result).isTrue()
    }

    @Test
    @DisplayName("Given the number which don't have pair with sum in the array, then should return FALSE")
    fun given_NumberWithoutPair_ShouldReturnFALSE() {
        val arr = listOf(10, 15, 3, 7)
        val k = 11

        val result = hasPairWithSum(arr, k)

        assertThat(result).isFalse()
    }
}