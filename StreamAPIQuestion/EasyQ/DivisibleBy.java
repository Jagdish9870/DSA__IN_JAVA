package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class DivisibleBy {
    public static void main(String[] args) {
         List<Integer> numbers=Arrays.asList(5,10,15,21);

      boolean match=numbers.stream().anyMatch(n-> n %3==0);
         System.out.println(match);
    }
    
}
