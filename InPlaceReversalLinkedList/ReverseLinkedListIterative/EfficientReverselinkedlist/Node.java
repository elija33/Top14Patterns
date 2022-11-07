package InPlaceReversalLinkedList.ReverseLinkedListIterative.EfficientReverselinkedlist;

public class Node {
    int data;
    Node next;

    public Node(int c) {
        data = c;
        next = null;
    }
}

class Test {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(3);
        head.next.next = new Node(5);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        printlist(head);
        head = reverse(head);
        printlist(head);
    }

    // Reversing the linked list
    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printlist(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println();
    }
}
