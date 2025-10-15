package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;

public class SquareOfEven {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> result=nums.stream().filter(n->n%2==0).map(n->n*n).toList(); // can use  toList() directly in place of .collect(Collectors.toList()) in case you dont want to add extra element 
        System.out.println(result);

    }
    
}
