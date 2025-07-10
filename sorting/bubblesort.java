package sorting;


public class Bubblesort {
    public static void bubble(int arr[],int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        // Example usage of bubble sort
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubble(arr, arr.length);
        System.out.println("Sorted array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    }
    

