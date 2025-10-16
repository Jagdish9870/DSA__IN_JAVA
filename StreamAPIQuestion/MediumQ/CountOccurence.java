package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurence {
    public static void main(String[] args) {
        List<String> word=Arrays.asList("apple","alo","banana","apple","grape","lichi","alo");

        Map<String,Long> output=word.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(output);
    }
    
}
