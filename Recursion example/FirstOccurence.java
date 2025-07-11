public class FirstOccurence {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 5;
        System.out.println(firstOccurrence(arr, target,0));
        
    }


    private static int firstOccurrence(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Base case: not found
        }
        if (arr[index] == target) {
            return index; // Found
        }
        return firstOccurrence(arr, target, index + 1); 
    }

}
