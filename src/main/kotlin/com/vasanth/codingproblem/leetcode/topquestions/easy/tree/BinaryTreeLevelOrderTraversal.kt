package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.model.TreeNode

fun binaryTreeLevelOrderTraversal(root: TreeNode?): List<List<Int>> {
    val result: MutableList<List<Int>> = mutableListOf()

    if (root != null) {
        for (level in 1..height(root)) {
            val items = mutableListOf<Int>()
            getGivenLevel(root, level, items)
            result.add(items)
        }
    }

    return result
}

@SuppressWarnings("ReturnCount")
private fun height(node: TreeNode?): Int {
    if (node == null)
        return 0

    val leftDepth = height(node.left)
    val rightDepth = height(node.right)

    if (leftDepth > rightDepth) {
        return leftDepth + 1
    } else {
        return rightDepth + 1
    }
}

private fun getGivenLevel(root: TreeNode?, level: Int, items: MutableList<Int>) {
    if (root == null)
        return

    if (level == 1)
        items.add(root.`val`)

    getGivenLevel(root.left, level - 1, items)
    getGivenLevel(root.right, level - 1, items)
}
