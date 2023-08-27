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

class LinkedList {
    Node start = null;

    void addNode(int d) {
        if (start == null) {
            start = new Node(d);
        } else {
            Node n = new Node(d);
            n.next = start;
            start = n;
        }
    }

    void displayList() {
        Node current = start;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void insertFirst(int d) {
        Node newNode = new Node(d);
        newNode.next = start;
        start = newNode;
    }

    void insertLast(int d) {
        Node newNode = new Node(d);
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

    void insertAfter(Node prevNode, int d) {
        if (prevNode == null) {
            System.out.println("Previous node cannot be null.");
            return;
        }
        Node newNode = new Node(d);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    void insertBefore(Node nextNode, int d) {
        if (nextNode == null) {
            System.out.println("Next node cannot be null.");
            return;
        }
        Node newNode = new Node(d);
        if (start == nextNode) {
            newNode.next = start;
            start = newNode;
            return;
        }
        Node current = start;
        while (current.next != nextNode) {
            current = current.next;
        }
        newNode.next = nextNode;
        current.next = newNode;
    }
}

public class insertflab{
    public static void main(String args[]) {
        LinkedList list = new LinkedList();
        list.addNode(70);
        list.addNode(50);
        list.addNode(30);
        list.displayList();

        System.out.println("After Inserting 60 at the beginning:");
        list.insertFirst(60); // Use the correct method name "insertFirst"
        list.displayList();

        System.out.println("After Inserting 80 at the end:");
        list.insertLast(80); // Use the correct method name "insertLast"
        list.displayList();

        Node nodeToInsertAfter = list.start.next; // Node with data 50
        System.out.println("After Inserting 55 after node with data 50:");
        list.insertAfter(nodeToInsertAfter, 55);
        list.displayList();

        Node nodeToInsertBefore = list.start.next.next; // Node with data 70
        System.out.println("After Inserting 65 before node with data 70:");
        list.insertBefore(nodeToInsertBefore, 65);
        list.displayList();
    }
}