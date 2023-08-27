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
}

public class addinsertdisplnode {
    public static void main(String args[]) {
        LinkedList list = new LinkedList(); // Create an instance of LinkedList
        list.addNode(50);
        list.addNode(60);
        list.addNode(70);
        list.displayList();
    }
}