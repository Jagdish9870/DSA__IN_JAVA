package LinkedListEx;

public class RemoveFirst {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeFirst(Node head) {
        if (head == null) {
            return null; // If the list is empty, do nothing
        }
        head = head.next; // Move the head to the next node
        return head; // Return the new head of the list
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3; 
        Node head = n1;
        
        head = removeFirst(head); // Remove the first node
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
    
}
