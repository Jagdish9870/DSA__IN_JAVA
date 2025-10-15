package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class FindAvg {
    public static void main(String[] args) {
        List<Integer> numbers=Arrays.asList(5,4,6,8,7,2,4);
        double avg=numbers.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println(avg);
    }
    
}
