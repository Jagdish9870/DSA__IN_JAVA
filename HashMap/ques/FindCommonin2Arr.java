package HashMap.ques;
import java.util.HashMap;
public class FindCommonin2Arr {
    public static void findCommonElements(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Store elements of the first array in the HashMap
        for (int num : arr1) {
            map.put(num, 1);
        }

        // Check for common elements in the second array
        for (int num : arr2) {
            if (map.containsKey(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};

        System.out.println("Common elements in both arrays:");
        findCommonElements(arr1, arr2);
    }
    
}
