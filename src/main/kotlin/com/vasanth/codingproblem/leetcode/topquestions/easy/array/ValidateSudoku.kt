package com.vasanth.codingproblem.leetcode.topquestions.easy.array

@SuppressWarnings("MagicNumber", "ReturnCount", "NestedBlockDepth")
fun validateSudoku(board: Array<CharArray>): Boolean {
    val rows = Array(9) { HashSet<Char>() }
    val columns = Array(9) { HashSet<Char>() }
    val grids = Array(9) { HashSet<Char>() }

    for (i in 0..8) {
        for (j in 0..8) {
            val char = board[i][j]
            if (char != '.') {
                // Row
                val rowIndex = i
                val rowElements = rows[rowIndex]
                if (rowElements.contains(char)) {
                    return false
                }
                rowElements.add(char)
                rows[rowIndex] = rowElements

                // Column
                val columnIndex = j
                val columnElements = columns[columnIndex]
                if (columnElements.contains(char)) {
                    return false
                }
                columnElements.add(char)
                columns[columnIndex] = columnElements

                // Grid
                val gridIndex = (((i / 3) * 3) + (j / 3))
                val gridElements = grids[gridIndex]
                if (gridElements.contains(char)) {
                    return false
                }
                gridElements.add(char)
                grids[gridIndex] = gridElements
            }
        }
    }

    return true
}
