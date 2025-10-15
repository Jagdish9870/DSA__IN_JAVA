package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
              List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
             Integer sum=nums.stream()
                                    .reduce(0, (a,b)-> a+b);
                                    
         System.out.println(sum);
    }
    
}
