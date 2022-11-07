package InPlaceReversalLinkedList.ReverseLinkedlistRecursive.ReverseLinkedlistMethod1;

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
        head = reverlist(head);
        printlist(head);
    }

    // Reversing Linked list
    public static Node reverlist(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node resthead = reverlist(head.next);
        Node resttail = head.next;
        resttail.next = head;
        head.next = null;
        return resthead;
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
