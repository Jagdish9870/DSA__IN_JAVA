import java.util.Scanner;

public class fibonacciNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number to find fibonacci");
        int n=sc.nextInt();
    if(n==0){
        System.out.println(0);
    }
    else{
        int fib[]=new int[n+1];
       fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<=n;i++){
            System.out.println(fib[i]);
        }




    }
    

         
    }
    
}
