package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

/**
 * Remove Nth Node From End of List
 */
@SuppressWarnings("ReturnCount")
fun removeNthNodeFromEndOfList(head: ListNode?, n: Int): ListNode? {
    if (head != null) {
        var first: ListNode = head
        var second: ListNode = head

        // Move second ptr to nth position.
        for (i in 1..n) {
            // If n = length of list - We are deleting the head.
            if (second.next == null) {
                return head.next
            }
            second = second.next!!
        }

        while (second.next != null) {
            first = first.next!!
            second = second.next!!
        }

        first.next = first.next?.next
        return head
    } else {
        return null
    }
}
