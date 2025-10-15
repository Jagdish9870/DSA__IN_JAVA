package StriversDSA.Hashing;
import java.util.*;

public class ApperanceOfNumberUsingHashMap {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size and array of numbers:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        // Reading input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Precompute using HashMap
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }

        // Query
        System.out.println("Enter the size and query numbers:");
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            System.out.println("Count of " + query + " is: " + hashMap.getOrDefault(query, 0));
        }

        sc.close();
    }
    
}
