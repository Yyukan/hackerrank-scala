package net.shtykhno.algorithms.crackingandcoding;

/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as:
    class Node {
        int data;
        Node next;
    }
*/

import java.util.HashSet;

public class ListCycleHashSet {

    // cycle
    boolean hasCycle(Node head) {
        final HashSet<Node> visited = new HashSet<Node>();

        Node next = head;
        while (next != null) {
            if (visited.contains(next)) {
                return true;
            } else {
                visited.add(next);
            }
            next = next.next;
        }
        return false;
    }

    // recursion
    boolean hasCycle(Node node, HashSet<Node> visited) {
        if (node == null) {
            return false;
        }
        if (visited.contains(node)) {
            return true;
        } else {
            visited.add(node);
        }
        return hasCycle(node.next, visited);
    }

    

}

class Node {
    int data;
    Node next;
}
