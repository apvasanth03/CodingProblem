package com.vasanth.codingproblem.leetcode.topquestions.easy.tree.util

import com.vasanth.codingproblem.leetcode.topquestions.easy.tree.model.TreeNode
import java.util.*

fun Array<Int?>.toTree(): TreeNode? {
    if (isEmpty()) {
        return null
    }

    val root = TreeNode(this[0]!!)
    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)
    var i = 1
    while (i < this.size) {
        val parent = queue.poll()

        val left = this[i++]?.let { TreeNode(it) }
        parent.left = left
        queue.add(left)

        if (i < this.size) {
            val right = this[i++]?.let { TreeNode(it) }
            parent.right = right
            queue.add(right)
        }
    }

    return root
}