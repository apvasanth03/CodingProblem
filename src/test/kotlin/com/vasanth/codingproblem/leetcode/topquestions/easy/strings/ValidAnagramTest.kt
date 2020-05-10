package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class ValidAnagramTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "car", false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test valid anagram functionality`(s: String, t: String, expectedResult: Boolean) {
        val result = validAnagram(s, t)

        assertThat(result).isEqualTo(expectedResult)
    }
}