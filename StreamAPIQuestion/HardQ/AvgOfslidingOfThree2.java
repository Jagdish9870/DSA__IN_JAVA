package StreamAPIQuestion.HardQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class AvgOfslidingOfThree2 {
    public static void main(String[] args) {
        // if the window size given or generic like for all window sizes-----------------------

                List<Integer> num=Arrays.asList(2,5,8,9,6,5);

                int window=3;
                List<Double> slidingAvg = IntStream.range(0,(num.size()-(window-1)))
                                    .mapToObj(i->num.subList(i, i+window))
                                    .map(w->w.stream().mapToInt(Integer::intValue).average().orElse(0))
                                    .toList();
                System.out.println(slidingAvg);



    }
    
}
