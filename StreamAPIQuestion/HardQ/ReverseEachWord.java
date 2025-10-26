package StreamAPIQuestion.HardQ;

import java.util.Arrays;

import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
         String sentence="The quick brown fox jumped over the lazy dog!";
     String reverseWords = Arrays.stream(sentence.split(" "))
                        .map(word->new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
      System.out.println(reverseWords);
    }
    
}
