package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash {
    public static void main(String[] args) {
        HashMap<String, Integer> st = new HashMap<>();
        st.put("A", 1);
        st.put("B", 2);
        st.put("C", 3);
        Set<String> keys=st.keySet();
        for(String key:keys){
            System.out.println("Key: " + key + ", Value: " + st.get(key));
            System.out.println(key.hashCode());
        }
// 2nd way
     Set<Map.Entry<String,Integer>> dta=st.entrySet();
        for(Map.Entry<String,Integer> entry:dta){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }




    }
    
}
