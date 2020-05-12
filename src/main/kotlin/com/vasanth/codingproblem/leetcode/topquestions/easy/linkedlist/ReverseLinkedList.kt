package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

fun reverseLinkedList(head: ListNode?): ListNode? {
    var curr = head
    var prev: ListNode? = null
    while (curr != null) {
        val tempNextNode = curr.next
        curr.next = prev
        prev = curr
        curr = tempNextNode
    }
    return prev
}
