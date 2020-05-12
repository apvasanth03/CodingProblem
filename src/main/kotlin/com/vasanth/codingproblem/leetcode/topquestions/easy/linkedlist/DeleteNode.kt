package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

/**
 * Delete Node in a Linked List.
 */
fun deleteNode(node: ListNode?) {
    if (node != null) {
        node.`val` = node.next!!.`val`
        node.next = node.next!!.next
    }
}
