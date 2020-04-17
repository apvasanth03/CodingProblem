package com.vasanth.codingproblem.essentialquestions.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class OneAwayStringsTests {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("abcde", "abcd", true),
                arguments("abde", "abcde", true),
                arguments("a", "a", true),
                arguments("abcdef", "abqdef", true),
                arguments("abcdef", "abccef", true),
                arguments("abcdef", "abcde", true),
                arguments("aaa", "abc", false),
                arguments("abcde", "abc", false),
                arguments("abc", "abcde", false),
                arguments("abc", "bcc", false)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test one away strings functionality`(str1: String, str2: String, expectedResult: Boolean) {
        val result = oneAwayStrings(str1, str2)

        assertThat(result).isEqualTo(expectedResult)
    }
}