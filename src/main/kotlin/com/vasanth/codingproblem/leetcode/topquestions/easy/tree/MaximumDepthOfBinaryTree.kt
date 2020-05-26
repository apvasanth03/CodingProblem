package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.model.TreeNode

/**
 * Maximum Depth of Binary Tree.
 */
fun maxDepthOfBinaryTree(root: TreeNode?): Int {
    return maxDepth(root)
}

@SuppressWarnings("ReturnCount")
private fun maxDepth(node: TreeNode?): Int {
    if (node == null)
        return 0

    val leftDepth = maxDepth(node.left)
    val rightDepth = maxDepth(node.right)

    if (leftDepth > rightDepth) {
        return leftDepth + 1
    } else {
        return rightDepth + 1
    }
}
