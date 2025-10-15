package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumToSquare {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5);
         List<Integer> numSq=nums.stream().map(n->n*n).collect(Collectors.toList());
         System.out.println(numSq);
    }
    
}
