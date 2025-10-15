package StreamAPIQuestion.BasicsQ;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstLargestOfGiven {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(1,2,5,13,11,12);

        Optional<Integer> result=nums.stream().filter(n-> n>10).sorted().findFirst();
        System.out.println(result.get());
    }
    
}
