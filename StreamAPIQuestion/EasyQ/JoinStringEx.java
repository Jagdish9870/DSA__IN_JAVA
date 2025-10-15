package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStringEx {
    public static void main(String[] args) {
         List<String> fruits=Arrays.asList("Apple","Banana","Avacado","Mango");
      String result=fruits.stream().collect(Collectors.joining(","));
        System.out.println(result);
    }
    
}
