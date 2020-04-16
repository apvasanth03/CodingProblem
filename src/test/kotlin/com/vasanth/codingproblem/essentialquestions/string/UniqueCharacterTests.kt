package com.vasanth.codingproblem.essentialquestions.string

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.Arguments.arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class UniqueCharacterTests {

    companion object {

        @JvmStatic
        fun provideTestData(): Stream<Arguments> {
            return Stream.of(
                arguments("abcab", 2),
                arguments("abab", -1),
                arguments("aabbbc", 5),
                arguments("aabbdbc", 4)
            )
        }
    }

    @ParameterizedTest
    @MethodSource("provideTestData")
    fun `test first unique character in a string functionality`(str: String, expectedResult: Int) {
        val result = firstUniqueCharacterInAString(str)

        assertThat(result).isEqualTo(expectedResult)
    }
}