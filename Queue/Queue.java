package Queue;
class QueueUsingArray {
    public static int[] arr;
    private int front;
    private int rear;
    private int capacity;

    public QueueUsingArray(int size) {
        arr = new int[size];
        capacity = size;
    }

    public void enqueue(int item) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        }
        else{
             arr[rear] = item;
        rear++; 

        }
       
    }

    public void dequeue() {
        if (rear==0) {
            System.out.println("Queue is empty");
           
        }
       else {
        for (int i = 0; i < rear - 1; i++) {
            arr[i] = arr[i + 1];
        }
       rear--;
    }
}
 public void display() {
        if (rear==0) {
            System.out.println("Queue is empty");
           
        }
       else {
        for (int i = 0; i < rear ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
    
}

public class Queue {
    public static void main(String[] args) {
        QueueUsingArray que = new QueueUsingArray(5);
        
        que.enqueue(10);
        que.enqueue(20);
        que.enqueue(30);
        que.enqueue(40);
        que.enqueue(50);
        
        System.out.println("Queue after enqueuing elements:");
        que.display();
        
        que.dequeue();
        System.out.println("\nQueue after dequeuing an element:");
        que.display();
        
        que.dequeue();
        System.out.println("\nQueue after dequeuing another element:");
        que.display();
         
    }
    
}
