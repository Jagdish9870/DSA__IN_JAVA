package Heap;
import java.util.PriorityQueue;

public class KthLargest {
    public static int findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);

            // Keep only k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest
            }
        }

        // Top of the heap is the Kth largest
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        int result = findKthLargest(arr, k);
        System.out.println("The " + k + "th largest element is: " + result);  // Output: 4
    }
}
