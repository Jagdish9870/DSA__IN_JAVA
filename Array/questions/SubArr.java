package Array.questions;

import java.util.Scanner;

public class SubArr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];


        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int si=0;si<n;si++){
            for(int ei=si;ei<n;ei++){
                for(int i=si;i<=ei;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
    
}
