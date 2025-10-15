package StreamAPIQuestion.EasyQ;

import java.util.Arrays;
import java.util.List;

public class FlatenList {
    public static void main(String[] args) {
        List<List<Integer>> listoflist=Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6),Arrays.asList(2,2,3));
        List<Integer> list=listoflist.stream().flatMap(List::stream).toList();
        System.out.println(list);
        
    }
    
}
