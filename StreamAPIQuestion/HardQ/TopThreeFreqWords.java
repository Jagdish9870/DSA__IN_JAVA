package StreamAPIQuestion.HardQ;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopThreeFreqWords {
    public static void main(String[] args) {
        String paragraph="The boy and the girl went to the park. They saw a dog and played with it. After that, they found a ball and kicked it. The sun was bright, and everyone felt happy. Their friends joined them, and together they made a big circle to play";

     List<Map.Entry<String,Long>> freqWord = Arrays.stream(paragraph.toLowerCase().replaceAll("[^a-z\s]","").split(" "))
                                                    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                                                    .entrySet()
                                                    .stream()
                                                    .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                                                    .limit(3)
                                                    .toList();
      System.out.println(freqWord);
    }
    
}
