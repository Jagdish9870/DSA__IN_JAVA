package generalQue;
import java.util.*;

public class NumberFittingInWhichRange {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int t=sc.nextInt();

    for(int i=0;i<t;i++)
    {

        try
        {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte\n* short\n* int\n* long");
            else if(x>=Short.MIN_VALUE &&x<=Short.MAX_VALUE) System.out.println("* short\n* int\n* long");
            else if(x>=Integer.MIN_VALUE &&x<=Integer.MAX_VALUE) System.out.println("* int\n* long");
            else System.out.println("* long");
            }
        catch(Exception e)
        {
            System.out.println(sc.next()+" can't be fitted anywhere.");
        }

    }
    sc.close();
    }
}

