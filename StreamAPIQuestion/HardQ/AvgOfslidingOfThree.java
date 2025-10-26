package StreamAPIQuestion.HardQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AvgOfslidingOfThree {
    public static void main(String[] args) {
        List<Integer> num=Arrays.asList(2,5,8,9,6,5);

        List<Double> slidingAvg=IntStream.range(0,num.size()-2).mapToObj(i->(num.get(i)+num.get(i+1)+num.get(i+2))/3.0).toList();
        System.out.println(slidingAvg);
        
    }
    
}
