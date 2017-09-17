package net.shtykhno.algorithms.crackingandcoding;

/**
 * For the purposes of this challenge, we define a binary search tree to be a binary tree with the following
 * ordering properties:

 The  value of every node in a node's left subtree is less than the data value of that node.
 The  value of every node in a node's right subtree is greater than the data value of that node.
 Given the root node of a binary tree, can you determine if it's also a binary search tree?

 Complete the function in your editor below, which has  parameter: a pointer to the root of a binary tree.
 It must return a boolean denoting whether or not the binary tree is a binary search tree.
 You may have to write one or more helper functions to complete this challenge.

 Note: We do not consider a binary tree to be a binary search tree if it contains duplicate values.
 */
public class IsBinarySearchTree {

    boolean check(Node node, Integer min, Integer max) {
        if (node == null)
            return true;

        if (node.data <= min || node.data >= max)
            return false;

        return check(node.left, min, node.data) && check(node.right, node.data, max);
    }

    boolean checkBST(Node root) {
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    class Node {
        int data;
        Node left;
        Node right;
    }
}
