package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;

public class SumSqEven {
    public static void main(String[] args) {
        List<Integer> numb=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer result=numb.stream().filter(n -> n%2== 0).map(n-> n*n).reduce(0,(a,b)-> a+b);
        System.out.println(result);
    }
    
}
