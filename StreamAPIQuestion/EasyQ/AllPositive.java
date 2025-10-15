package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;
public class AllPositive {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,2,3,4,5,-1,-5);

        //  List<Integer> PositiveNumbers=numbers.stream().filter(n-> n >0).collect(Collectors.toList());
        //  System.out.println(PositiveNumbers);
      boolean PositiveNumbers=numbers.stream().allMatch(n-> n >0);
         System.out.println(PositiveNumbers);
    }
    
}
