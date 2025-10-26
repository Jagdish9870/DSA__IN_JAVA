package StreamAPIQuestion.HardQ;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord2 {
    public static void main(String[] args) {
          String sentence="The quick brown fox jumped over the lazy dog!";
     String reverseWords = Arrays.stream(sentence.split(" "))
                        .map(word->Arrays.stream(word.split("")).reduce("", (rev,ch)->ch+rev)).collect(Collectors.joining(" "));
      System.out.println(reverseWords);
    }
    
}
