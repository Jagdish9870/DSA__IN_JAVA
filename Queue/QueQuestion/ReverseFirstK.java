package Queue.QueQuestion;

import java.util.ArrayDeque;

public class ReverseFirstK {
    public static void main(String[] args) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Original Queue: " + queue);
        reverseFirstKElements(queue, 3);
        System.out.println("Queue after reversing first 3 elements: " + queue);
    }
    public static void reverseFirstKElements(ArrayDeque<Integer> queue, int k) {
        if (queue.isEmpty() || k <= 0 || k > queue.size()) {
            return;
        }

        // Stack to hold the first k elements
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Dequeue the first k elements and push them onto the stack
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }

        // Enqueue the reversed elements back into the queue
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }

        // Move the remaining elements to the back of the queue
        int remainingElements = queue.size() - k;
        for (int i = 0; i < remainingElements; i++) {
            queue.offer(queue.poll());
        }
    }
}
