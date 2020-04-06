package com.vasanth.codingproblem.set.easy

/**
This problem was recently asked by Google.

Given a list of numbers and a number k, return whether any two numbers from the list add up to k.

For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.

Bonus: Can you do this in one pass?

Solution:
https://www.youtube.com/watch?v=XKu_SEDAykw
https://www.geeksforgeeks.org/given-an-array-a-and-a-number-x-check-for-pair-in-a-with-sum-as-x/
 */
fun hasPairWithSum(arr: Array<Int>, sum: Int): Boolean {
    val numberSet = HashSet<Int>()
    for (number in arr) {
        val remaining = sum - number
        if (numberSet.contains(remaining)) {
            return true
        }
        numberSet.add(number)
    }
    return false
}