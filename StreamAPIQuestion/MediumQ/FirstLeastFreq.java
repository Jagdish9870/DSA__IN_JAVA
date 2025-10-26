package StreamAPIQuestion.MediumQ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstLeastFreq {
    public static void main(String[] args) {

        String input="nimn";
        Optional<Map.Entry<Character,Long>> firstNonRepeating=input.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting())).entrySet().stream().filter(e->e.getValue()==1).findFirst();
        System.out.println(firstNonRepeating);
    }
    
}
