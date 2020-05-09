package com.vasanth.codingproblem.leetcode.topquestions.easy.array

/**
 * Rotate Image.
 */
fun rotateImage(matrix: Array<IntArray>) {
    val tempMatrix = Array(matrix.size) { Array(matrix.size) { -1 } }
    for (i in matrix.indices) {
        for (j in matrix.indices) {
            val rotatedRowIndex = j
            val rotatedColumnIndex = (matrix.size - 1) - i
            tempMatrix[rotatedRowIndex][rotatedColumnIndex] = matrix[i][j]
        }
    }

    for (i in tempMatrix.indices) {
        for (j in tempMatrix.indices) {
            matrix[i][j] = tempMatrix[i][j]
        }
    }
}
