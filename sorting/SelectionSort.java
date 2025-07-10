package sorting;

public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minval=arr[i];
            int minindex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<minval){
                    minval=arr[j];
                    minindex=j;
                }
            }
            
            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;

            
        }
        for(int val: arr){
                System.out.print(val+" ");
            }
    }
    public static void main(String[] args) {
        int arr[]={64, 34, 25, 12, 22, 11, 90};
        selectionSort(arr);
    }
    
}
