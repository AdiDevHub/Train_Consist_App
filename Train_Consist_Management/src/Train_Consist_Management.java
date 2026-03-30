import java.util.*;

// Custom Exception Class
class InvalidBogieCapacityException extends Exception {
    public InvalidBogieCapacityException(String message) {
        super(message);
    }
}

public class Train_Consist_Management {

    static class Bogie {
        String name;
        int capacity;

        public Bogie(String name, int capacity) throws InvalidBogieCapacityException {
            if (capacity < 0) {
                throw new InvalidBogieCapacityException("Capacity cannot be negative: " + capacity);
            }
            this.name = name;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return name + " (Seats: " + capacity + ")";
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC14 - Handle Invalid Bogie Capacity ");
        System.out.println("==============================================\n");

        try {
            // Case 1: Valid Bogie
            Bogie valid = new Bogie("Sleeper", 72);
            System.out.println("Created: " + valid);

            // Case 2: Invalid Bogie (This will trigger the catch block)
            System.out.println("Attempting to create invalid bogie...");
            Bogie invalid = new Bogie("Ghost Bogie", -10);

        } catch (InvalidBogieCapacityException e) {
            System.err.println("SAFETY ALERT: " + e.getMessage());
        }

        System.out.println("\nUC14 exception handling completed...");
    }
}