package HashMap;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("apple", 1);    
        map.put("banana", 2);
        map.put("orange", 3);
        map.put("grape", 4);


        // Accessing elements
        System.out.println("Value for 'apple': " + map.get("apple")); // Output
        System.out.println("Value for 'banana': " + map.get("banana")); // Output: 2
        System.out.println("Value for 'orange': " + map.get("orange")); // Output

        // Checking if a key exists
        System.out.println("Contains key 'grape': " + map.containsKey("grape"));
        System.out.println("Contains key 'kiwi': " + map.containsKey("kiwi"));

        // accessing all keys and values
        System.out.println("All keys and values in the map:");
        for (String key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));

        }

        //size
        System.out.println("Size of the map: " + map.size());
        // Removing an element
        map.remove("banana");
        System.out.println("After removing 'banana': " + map);
    }
    
}
