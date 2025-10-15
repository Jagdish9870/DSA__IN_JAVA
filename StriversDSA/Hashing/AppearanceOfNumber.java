package StriversDSA.Hashing;

import java.util.Scanner;

//using array but there is one problem if the number is greater than 100000 then it will show ArrayIndexOutOfBoundsException so we can use HashMap -- for that there is another code in another file
public class AppearanceOfNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size and array of numbers ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();

        }
// precompute
        int hash[]=new int[100000];
        for(int i=0;i<n;i++){
            hash[nums[i]]+=1;
        }

        System.out.println("enter the size and Query of numbers ");
        int n2=sc.nextInt();
        int[] query=new int[n2];
         for(int i=0;i<n2;i++){
          query[i]=sc.nextInt();

          System.out.println(hash[query[i]]);

        }
        sc.close();
        
    }
    
}
