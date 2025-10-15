package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class NonEmptyString {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("","null","heelo");
         List<String> nonEMList=list.stream().filter(s->!s.isEmpty()).toList();
         System.out.println(nonEMList);
    }
    
}
