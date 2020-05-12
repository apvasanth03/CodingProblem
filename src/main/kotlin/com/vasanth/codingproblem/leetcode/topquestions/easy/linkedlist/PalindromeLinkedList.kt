package com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist

import com.vasanth.codingproblem.leetcode.topquestions.easy.linkedlist.model.ListNode

/**
 * Is Palindrome.
 *
 * Ref - https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 */
@SuppressWarnings("ReturnCount")
fun isPalindrome(head: ListNode?): Boolean {
    if (head == null) {
        return false
    }

    // List contains only one element.
    if (head.next == null) {
        return true
    }

    // Get to middle of list
    var fastPtr = head
    var slowPtr: ListNode = head
    var prevSlowPtr: ListNode? = null
    while (fastPtr != null && fastPtr.next != null) {
        fastPtr = fastPtr.next!!.next
        prevSlowPtr = slowPtr
        slowPtr = slowPtr.next!!
    }

    // Skip middle element for 'length = odd'
    if (fastPtr != null) {
        slowPtr = slowPtr.next!!
    }

    // Terminate first half.
    prevSlowPtr!!.next = null

    var secondHalf: ListNode = slowPtr

    // Reverse second half.
    var curr: ListNode? = secondHalf
    var prev: ListNode? = null
    while (curr != null) {
        val tempNext = curr.next
        curr.next = prev
        prev = curr
        curr = tempNext
    }
    secondHalf = prev!!

    // Compare first & reversed second half.
    var ptr1: ListNode? = head
    var ptr2: ListNode? = secondHalf
    while (ptr1 != null && ptr2 != null) {
        if (ptr1.`val` != ptr2.`val`) {
            return false
        }
        ptr1 = ptr1.next
        ptr2 = ptr2.next
    }

    return true
}
