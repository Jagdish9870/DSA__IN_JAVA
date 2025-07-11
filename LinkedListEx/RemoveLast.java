package LinkedListEx;

public class RemoveLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node removeLast(Node head) {
        if (head == null) {
            return null; // If the list is empty, do nothing
        }
        if (head.next == null) {
            return null; // If there's only one node, return null
        }
        Node temp=head;
        while (temp.next.next != null) {
            temp = temp.next; // Traverse to the second last node
            
        }
        temp.next = null; // Set the next of the second last node to null
        return head; // Return the head of the list
    }
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        n1.next = n2;
        n2.next = n3; 
        Node head = n1;
        
        head = removeLast(head); // Remove the first node
        
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        
    }
    
}
