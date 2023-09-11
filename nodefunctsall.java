package javadsa;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class nodefunctsall {
    Node start = null;

    // Insert a node at the beginning
    void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = start;
        start = newNode;
    }

    // Insert a node at the end
    void insertLast(int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
        } else {
            Node current = start;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Insert a node before a given node
    void insertBefore(Node nextNode, int data) {
        if (nextNode == null) {
            System.out.println("Next node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        if (start == nextNode) {
            newNode.next = start;
            start = newNode;
            return;
        }

        Node current = start;
        while (current != null && current.next != nextNode) {
            current = current.next;
        }

        if (current != null) {
            newNode.next = nextNode;
            current.next = newNode;
        } else {
            System.out.println("Given node not found in the list.");
        }
    }

    // Insert a node after a given node
    void insertAfter(Node prevNode, int data) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    // Delete the first node
    void deleteFirst() {
        if (start != null) {
            start = start.next;
        } else {
            System.out.println("List is empty. Nothing to delete.");
        }
    }

    // Delete the last node
    void deleteLast() {
        if (start == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (start.next == null) {
            start = null;
            return;
        }

        Node current = start;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // Delete a given node
    void deleteNode(Node nodeToDelete) {
        if (nodeToDelete == null) {
            System.out.println("Node to delete cannot be null.");
            return;
        }

        if (start == nodeToDelete) {
            start = start.next;
            return;
        }

        Node current = start;
        while (current != null && current.next != nodeToDelete) {
            current = current.next;
        }

        if (current != null) {
            current.next = nodeToDelete.next;
        } else {
            System.out.println("Node not found in the list.");
        }
    }

    // Delete a node after a given node
    void deleteAfter(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            System.out.println("Previous node or its next node cannot be null.");
            return;
        }

        prevNode.next = prevNode.next.next;
    }

    // Display the linked list
    void displayList() {
        Node current = start;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert nodes
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.displayList();

        // Insert at the beginning
        list.insertFirst(5);
        list.displayList();

        // Insert before a given node
        Node nodeToInsertBefore = list.start.next.next; // Node with data 20
        list.insertBefore(nodeToInsertBefore, 15);
        list.displayList();

        // Insert after a given node
        Node nodeToInsertAfter = list.start.next.next; // Node with data 15
        list.insertAfter(nodeToInsertAfter, 25);
        list.displayList();

        // Delete nodes
        list.deleteFirst();
        list.displayList();

        list.deleteLast();
        list.displayList();

        Node nodeToDelete = list.start.next.next; // Node with data 15
        list.deleteNode(nodeToDelete);
        list.displayList();

        Node nodeToDeleteAfter = list.start.next.next; // Node with data 20
        list.deleteAfter(nodeToDeleteAfter);
        list.displayList();
    }
}
