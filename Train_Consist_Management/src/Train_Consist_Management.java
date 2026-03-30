import java.util.*;

/**
 * UC7 - Train Consist Management: Sort Bogies by Capacity
 */

public class Train_Consist_Management {

    // Inner Bogie class to model passenger bogies
    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // 1. Create list and add passenger bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // 2. Display before sorting
        System.out.println("Before Sorting:");
        bogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // Using the key requirement: Comparator.comparingInt()
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // 4. Display after sorting
        System.out.println("\nAfter Sorting by Capacity:");
        bogies.forEach(System.out::println);

        System.out.println("\nUC7 sorting completed...");
    }
}