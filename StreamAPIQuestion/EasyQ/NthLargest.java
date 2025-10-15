package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class NthLargest {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(10,2,5,11,5,8);
        Optional<Integer> larg3rd=numbers.stream().sorted(Comparator.reverseOrder()).skip(3).findFirst();
        System.out.println(larg3rd.get());
    }
    
}
