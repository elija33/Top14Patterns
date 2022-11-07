package InPlaceReversalLinkedList.ReverseLinkedListIterative.NavieReverseLinkedlist;

import java.util.ArrayList;

public class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(6);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(10);
        printlist(head);
        head = revList(head);
        printlist(head);
    }

    // Puting the linked list into array
    public static Node revList(Node head) {
        ArrayList<Integer> name = new ArrayList<Integer>();
        for (Node curr = head; curr != null; curr = curr.next) {
            name.add(curr.data);
        }

        // Putting the element back from array to linked list.
        for (Node curr = head; curr != null; curr = curr.next) {
            curr.data = name.remove(name.size() - 1);
        }
        return head;
    }

    // Print out all the linked list
    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}
