package LinkedListEx;

import org.w3c.dom.Node;

public class Addinghead {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node addFirst(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // If the list is empty, return the new node as the head
        }
        newNode.next = head; // Point the new node to the current head
        return newNode; // Return the new node as the new head
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3; 
        Node head=n1;
        head=addFirst(head, 5);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        
    }
    
}
