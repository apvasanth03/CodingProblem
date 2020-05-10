# Implement strStr()

[LeetCode Question Link](https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/885/)

[Solution](https://github.com/apvasanth03/CodingProblem/blob/master/src/main/kotlin/com/vasanth/codingproblem/leetcode/topquestions/easy/strings/StrStr.kt)

Implement [strStr()](http://www.cplusplus.com/reference/cstring/strstr/).

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

**Example 1:**

```
Input: haystack = "hello", needle = "ll"
Output: 2
```

**Example 2:**

```
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```

**Clarification:**

What should we return when `needle` is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when `needle` is an empty string. This is consistent to C's [strStr()](http://www.cplusplus.com/reference/cstring/strstr/) and Java's [indexOf()](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html#indexOf(java.lang.String)).