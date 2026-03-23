import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * =======================================================
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 * =======================================================
 * Use Case 6: Map Bogie to Capacity (HashMap)
 * * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 * * At this stage, the application:
 * - Creates a HashMap for bogie-capacity mapping
 * - Inserts capacity values via User Input
 * - Iterates through map entries
 * - Displays bogie and capacity information
 * * This maps lookup-based access using HashMap.
 * * @author Developer
 * @version 6.0
 */
public class Train_Consist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("=========================================\n");

        // Create a HashMap to store bogie-capacity information
        // Key: Bogie Name (String), Value: Capacity (Integer)
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- User Input Flow ----
        System.out.println("Enter details for 4 bogie types:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Enter Bogie Name (e.g., Sleeper): ");
            String name = scanner.nextLine();
            System.out.print("Enter Capacity for " + name + ": ");
            int capacity = Integer.parseInt(scanner.nextLine());

            // Using put() to map bogie to its capacity
            capacityMap.put(name, capacity);
        }

        // Display results matching the requirement output
        System.out.println("\nBogie Capacity Details:");

        // Iterating over the map using entrySet()
        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");

        scanner.close();
    }
}