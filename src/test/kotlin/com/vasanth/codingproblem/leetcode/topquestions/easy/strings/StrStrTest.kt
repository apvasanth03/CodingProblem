package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class StrStrTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("hello", "ll", 2),
                arguments("aaaaa", "bba", -1)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test strStr functionality`(haystack: String, needle: String, expectedResult: Int) {
        val result = strStr(haystack, needle)

        assertThat(result).isEqualTo(expectedResult)
    }
}