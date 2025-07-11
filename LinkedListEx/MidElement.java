package LinkedListEx;

public class MidElement {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node findMid(Node head) {
        if (head == null) return null; // Handle empty list
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; // Move slow by 1
            fast = fast.next.next; // Move fast by 2
        }
        return slow; // Slow will be at the middle element
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node midNode = findMid(head);
        if (midNode != null) {
            System.out.println("Middle element: " + midNode.data);
        } else {
            System.out.println("List is empty.");
        }
    }
    
}
