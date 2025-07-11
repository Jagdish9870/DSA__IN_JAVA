package HashSet;

import java.util.HashSet;

public class HashSetPro {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        // Displaying the elements in the HashSet
        System.out.println("HashSet elements: " + set);
        // Checking if an element exists
        if (set.contains("Banana")) {
            System.out.println("Banana is in the HashSet.");
        } else {
            System.out.println("Banana is not in the HashSet.");
        }
        // Removing an element
        set.remove("Orange");
        System.out.println("After removing Orange, HashSet elements: " + set);
        // Checking the size of the HashSet
        System.out.println("Size of the HashSet: " + set.size());
        // Iterating through the HashSet
        System.out.println("Iterating through HashSet:");
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
    
}
