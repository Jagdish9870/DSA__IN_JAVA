package HashMap.ques;

import java.util.HashMap;


public class charOccurenceCountWithHashMap{
    public static void countCharOccurrences(String str) {
       HashMap<Character, Integer> charMap = new HashMap<>();
        
        
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
          if(charMap.containsKey(ch)){
            int count = charMap.get(ch);
              charMap.put(ch, count+1);
          } else {
              charMap.put(ch, 1);
          }
       }
       int maxValue = 0;
       char maxChar = ' ';
         for (Character key : charMap.keySet()) {
             if(charMap.get(key) > maxValue) {
                 maxValue = charMap.get(key);
                 maxChar = key;
             }
         }
         System.out.println("Character with maximum occurrence: " + maxChar +" : "+ maxValue );
    }
    public static void main(String[] args) {
        String str="HelloDuniyaHello";
        countCharOccurrences(str);
    }

}