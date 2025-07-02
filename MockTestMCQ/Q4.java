public class Q4 {
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7, 8, 9};
        for(int i=0;i<(1<<9);i++){
            int sum=0;
            for(int j=0;j<9;j++){
                if((i & (1<<j)) != 0){
                    sum+=arr[j];
                }
            }
            if(i==327){
                System.out.println(sum);
            }
        }
    }
    
}
