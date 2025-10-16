package StreamAPIQuestion.MediumQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {
        List<String> words=Arrays.asList("apple","banana","grape","lichi","alo");

        Map<Integer,List<String>> output=words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(output);
    }
    
}
