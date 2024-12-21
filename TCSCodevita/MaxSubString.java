import java.util.*;

public class MaxSubString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        int num = Integer.parseInt(scanner.nextLine().trim());
       
        List<String> substrings = Arrays.asList(scanner.nextLine().trim().split("\\s+"));
        
      
        String mainString = scanner.nextLine().trim();
        
       
        int maxRemove = getMaxRemoved(mainString, substrings);
        System.out.println(maxRemove);
    }

    private static int getMaxRemoved(String mainString, List<String> substrings) {
        int maxCount = 0;

        for (String sub : substrings) {
            int index = mainString.indexOf(sub);
            if (index != -1) {
               
                String remainingString = mainString.substring(0, index) + mainString.substring(index + sub.length());
                
                
                maxCount = Math.max(maxCount, 1 + getMaxRemoved(remainingString, substrings));
            }
        }
        return maxCount;
    }
}
