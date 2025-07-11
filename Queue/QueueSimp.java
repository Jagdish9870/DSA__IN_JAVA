package Queue;

import java.util.ArrayDeque;

public class QueueSimp {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);

        System.out.println(queue.poll()); // Output: 10
        System.out.println(queue.peek()); // Output: 20
        queue.offer(50);
        System.out.println(queue.poll()); // Output: 20
        System.out.println(queue.peek()); // Output: 30


    }
    
}
