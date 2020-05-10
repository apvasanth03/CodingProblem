package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class LongestCommonPrefixTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(arrayOf("flower", "flow", "flight"), "fl"),
                arguments(arrayOf("dog", "racecar", "car"), "")
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test longest common prefix functionality`(strs: Array<String>, expectedResult: String) {
        val result = longestCommonPrefix(strs)

        assertThat(result).isEqualTo(expectedResult)
    }
}