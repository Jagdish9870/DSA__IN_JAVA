package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedOrder {
    public static void main(String[] args) {
            List<Integer> numbers=Arrays.asList(5,4,6,8,7,2,4);
        List<Integer> ReversedSorted=numbers.stream().distinct().sorted(Comparator.reverseOrder()).toList();
        System.out.println(ReversedSorted);
    }
    
}
