package StreamAPIQuestion.MediumQ;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInString {
    public static void main(String[] args) {
        String input="applepie";
        // Map<Character,Long> map=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        // System.out.println(map);

        // Map.Entry<Character,Long> max=map.entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        // System.out.println(max);

        // or
        
     Map.Entry<Character,Long> max=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).orElseThrow();
        System.out.println(max);
    }
    
}
