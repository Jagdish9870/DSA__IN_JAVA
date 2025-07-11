package LinkedListEx;

public class PrintLinked {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next; // Move to the next node
        }
        System.out.println(); // Print a new line at the end
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        
        head.next = second;
        second.next = third;
        third.next = null; // Last node points to null
        
        printLinkedList(head);
    }
    
}
