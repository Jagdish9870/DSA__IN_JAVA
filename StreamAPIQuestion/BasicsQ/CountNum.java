package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;

public class CountNum {
    public static void main(String[] args) {
         List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
      long counting=nums.stream()
                                    .filter(n-> n%2==0).count();
                                    
         System.out.println(counting);
    }
    
}
