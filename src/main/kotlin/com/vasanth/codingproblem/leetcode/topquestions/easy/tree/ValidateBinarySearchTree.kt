package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.model.TreeNode

/**
 * Validate Binary Search Tree.
 */
fun validateBinarySearchTree(root: TreeNode?): Boolean {
    return helper(root, null, null)
}

@SuppressWarnings("ReturnCount")
private fun helper(root: TreeNode?, lower: Int?, upper: Int?): Boolean {
    if (root == null)
        return true

    if (lower != null && root.`val` <= lower)
        return false

    if (upper != null && root.`val` >= upper)
        return false

    if (!helper(root.left, lower, root.`val`))
        return false

    if (!helper(root.right, root.`val`, upper))
        return false

    return true
}
