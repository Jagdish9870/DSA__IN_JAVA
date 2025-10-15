package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class DistinctEl {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(5,4,6,8,7,2,4);
        List<Integer> UniqueNumber=numbers.stream().distinct().toList();
        System.out.println(UniqueNumber);
        
    }
    
}
