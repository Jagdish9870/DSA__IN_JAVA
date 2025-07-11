package LinkedListEx;

import org.w3c.dom.Node;

public class AddingLast {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node addLast(Node head, int data) {
        Node newNode = new Node(data);
        Node tail=head;
        while(tail.next !=null){
            tail=tail.next; // Traverse to the end of the list

        }
        tail.next=newNode; // Point the last node's next to the new node
        return head; // Return the head of the list
      
    }
    public static void main(String[] args) {
        Node n1=new Node(10);
        Node n2=new Node(20);
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3; 
        Node head=n1;
        head=addLast(head, 5);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        
        
    }
    
}
