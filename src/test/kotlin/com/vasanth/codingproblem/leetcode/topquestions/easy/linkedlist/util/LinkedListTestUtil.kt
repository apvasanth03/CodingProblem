package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.util

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

fun IntArray.toLinkedList(): ListNode? {
    var head: ListNode? = null

    var prev: ListNode? = null
    for (num in this) {
        val node = ListNode(num)
        if (prev == null) {
            head = node
        } else {
            prev.next = node
        }
        prev = node
    }

    return head
}

fun ListNode.toArray(): IntArray {
    val items = mutableListOf<Int>()

    var first: ListNode? = this
    while (first != null) {
        items.add(first.`val`)
        first = first.next
    }

    return items.toIntArray()
}