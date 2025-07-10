package NumberQues;
import java.util.Scanner;

public class BinaryToDecimal{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int ans=0;
        int i=0;
        while(n!=0){
            int digit=n%10;
            if(digit==1){
                ans=(int) (Math.pow(2,i)+ans);


        }i++;
        n=n/10;
   
    }
    System.out.println(ans);
    sc.close();
}
}

