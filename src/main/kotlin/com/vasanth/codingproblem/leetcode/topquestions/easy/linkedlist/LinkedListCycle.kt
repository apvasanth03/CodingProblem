package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

@SuppressWarnings("ReturnCount")
fun hasLinkedListCycle(head: ListNode?): Boolean {

    if (head == null || head.next == null) {
        return false
    }

    var slowPtr = head
    var fastPtr = head.next
    while (slowPtr != fastPtr) {
        if (fastPtr == null || fastPtr.next == null) {
            return false
        }
        fastPtr = fastPtr.next!!.next
        slowPtr = slowPtr!!.next
    }
    return true
}
