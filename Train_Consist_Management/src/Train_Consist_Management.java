import java.util.*;

public class Train_Consist_Management {

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
        System.out.println(" UC10 - Count Total Seats in Train (Reduce) ");
        System.out.println("==============================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("Current Consist:");
        bogies.forEach(System.out::println);

        // UC10 Logic: Map to int and sum
        // .mapToInt extracts the capacity field
        // .sum() is a specialized reduction for numbers
        int totalSeats = bogies.stream()
                .mapToInt(b -> b.capacity)
                .sum();

        System.out.println("\nTotal Seating Capacity: " + totalSeats);
        System.out.println("\nUC10 calculation completed...");
    }
}