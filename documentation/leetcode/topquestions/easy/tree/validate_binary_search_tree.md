# Validate Binary Search Tree

[LeetCode Question Link](https://leetcode.com/explore/featured/card/top-interview-questions-easy/94/trees/625/)

[Solution](https://github.com/apvasanth03/CodingProblem/blob/master/src/main/kotlin/com/vasanth/codingproblem/leetcode/topquestions/easy/tree/ValidateBinarySearchTree.kt)

Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.
 

**Example 1:**

```
    2
   / \
  1   3

Input: [2,1,3]
Output: true
```

**Example 2:**

```
    5
   / \
  1   4
     / \
    3   6

Input: [5,1,4,null,null,3,6]
Output: false
Explanation: The root node's value is 5 but its right child's value is 4.
```