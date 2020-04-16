package com.vasanth.codingproblem.essentialquestions.array

/**
 * Is one array a rotation of another.
 */
@SuppressWarnings("ReturnCount")
fun isOneArrayARotationOfAnother(arr1: IntArray, arr2: IntArray): Boolean {
    if (arr1.size != arr2.size) {
        return false
    }

    if (arr1.isEmpty()) {
        return true
    }

    var ptr2 = -1
    for (index in arr2.indices) {
        if (arr1[0] == arr2[index]) {
            ptr2 = index
            break
        }
    }

    if (ptr2 == -1) {
        return false
    }

    for (ptr1 in arr1.indices) {
        if (arr1[ptr1] != arr2[ptr2]) {
            return false
        }

        ptr2 = (ptr2 + 1) % arr2.size
    }

    return true
}
