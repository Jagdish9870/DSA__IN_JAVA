package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class StringStartsWith {
    public static void main(String[] args) {
        List<String> fruits=Arrays.asList("Apple","Banana","Avacado");
        List<String> result=fruits.stream().filter(fr->fr.startsWith("A")).toList();
        System.out.println(result);
        
    }
    
}
