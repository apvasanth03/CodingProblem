package com.vasanth.codingproblem.essentialquestions.array

/**
 * Common elements in two sorted array.
 */
fun commonElementsInTwoSortedArrays(arr1: IntArray, arr2: IntArray): IntArray {
    val result = mutableListOf<Int>()

    var ptr1 = 0
    var ptr2 = 0
    while ((ptr1 < arr1.size) && (ptr2 < arr2.size)) {
        if (arr1[ptr1] == arr2[ptr2]) {
            result.add(arr1[ptr1])
            ptr1++
            ptr2++
        } else if (arr1[ptr1] > arr2[ptr2]) {
            ptr2++
        } else {
            ptr1++
        }
    }

    return result.toIntArray()
}
