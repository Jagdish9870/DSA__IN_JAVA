package LinkedListEx;

public class SearchInLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true; // Key found
            }
            current = current.next; // Move to the next node
        }
        return false; // Key not found
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        int keyToSearch = 20;
        boolean found = search(head, keyToSearch);
        System.out.println("Key " + keyToSearch + " found: " + found);
    }
    
}
