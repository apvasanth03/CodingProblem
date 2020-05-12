package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

/**
 * Merge Two Sorted Lists.
 */
fun mergeTwoSortedLists(l1: ListNode?, l2: ListNode?): ListNode? {
    var sl: ListNode? = null

    var l1Ptr = l1
    var l2Ptr = l2
    var slPtr = sl
    while (l1Ptr != null && l2Ptr != null) {
        val minNode: ListNode
        if (l1Ptr.`val` < l2Ptr.`val`) {
            minNode = l1Ptr
            l1Ptr = l1Ptr.next
        } else {
            minNode = l2Ptr
            l2Ptr = l2Ptr.next
        }

        if (slPtr == null) {
            slPtr = minNode
            sl = slPtr
        } else {
            slPtr.next = minNode
            slPtr = minNode
        }
    }

    while (l1Ptr != null) {
        if (slPtr == null) {
            slPtr = l1Ptr
            sl = slPtr
        } else {
            slPtr.next = l1Ptr
            slPtr = l1Ptr
        }

        l1Ptr = l1Ptr.next
    }

    while (l2Ptr != null) {
        if (slPtr == null) {
            slPtr = l2Ptr
            sl = slPtr
        } else {
            slPtr.next = l2Ptr
            slPtr = l2Ptr
        }

        l2Ptr = l2Ptr.next
    }

    return sl
}
