package LinkedListEx;

public class PrintLength {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static int printLength(Node head) {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next; // Move to the next node
        }
        return count; // Return the total count of nodes
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int length = printLength(head);
        System.out.println("Length of the linked list: " + length);
    }
    
}
