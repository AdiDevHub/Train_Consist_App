import java.util.*;
import java.util.stream.Collectors;

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
            return name + " (Capacity: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC9 - Search Passenger Bogie by Name ");
        System.out.println("==============================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // Search Target
        String searchName = "AC Chair";
        System.out.println("Searching for: " + searchName);

        // UC9 Logic: Use Stream to find a specific bogie by name
        Optional<Bogie> result = bogies.stream()
                .filter(b -> b.name.equalsIgnoreCase(searchName))
                .findFirst();

        // Display Result
        if (result.isPresent()) {
            System.out.println("Bogie Found: " + result.get());
        } else {
            System.out.println("Bogie not found in the consist.");
        }

        System.out.println("\nUC9 searching completed...");
    }
}