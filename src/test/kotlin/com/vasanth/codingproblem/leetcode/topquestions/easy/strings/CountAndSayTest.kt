package com.vasanth.codingproblem.leetcode.topquestions.easy.strings

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class CountAndSayTest {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments(1, "1"),
                arguments(4, "1211")
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test count and say functionality`(n: Int, expectedResult: String) {
        val result = countAndSay(n)

        assertThat(result).isEqualTo(expectedResult)
    }
}