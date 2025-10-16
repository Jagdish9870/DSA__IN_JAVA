package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(1,23,5,6,8,4,2);
        Map<Boolean,List<Integer>> output=numbers.stream().collect(Collectors.partitioningBy(n->n%2==0));

        System.out.println("Even : "+output.get(true));
        
        System.out.println("Odd : "+output.get(false));
    }
    
}
