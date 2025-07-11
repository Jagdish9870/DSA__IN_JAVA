package Heap;
import java.util.PriorityQueue;
public class KLargestElements {
    public static void findKLargest(int[] arr, int k) {
        // Min Heap to store top k largest elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : arr) {
            minHeap.offer(num);

            // Keep only k largest elements in the heap
            if (minHeap.size() > k) {
                minHeap.poll();  // Remove the smallest
            }
        }

        // Print the k largest elements
        System.out.println("Top " + k + " largest elements:");
        for (int num : minHeap) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 10, 4, 7, 20, 15};
        int k = 3;

        findKLargest(arr, k);  // Output (example): 10 15 20
    }
}
