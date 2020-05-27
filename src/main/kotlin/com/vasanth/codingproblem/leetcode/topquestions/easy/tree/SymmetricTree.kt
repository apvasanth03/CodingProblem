package com.vasanth.codingproblem.leetcode.topquestions.easy.tree

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.model.TreeNode


/**
 * Symmetric Tree
 */
fun isSymmetricTree(root: TreeNode?): Boolean {
    return isMirror(root, root)
}

@SuppressWarnings("ReturnCount")
private fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
    if (t1 == null && t2 == null)
        return true

    if (t1 == null || t2 == null)
        return false

    return (t1.`val` == t2.`val`) &&
            (isMirror(t1.right, t2.left)) &&
            (isMirror(t1.left, t2.right))
}
