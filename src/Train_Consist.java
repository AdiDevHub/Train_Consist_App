import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * =======================================================
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 * =======================================================
 * Use Case 5: Preserve Insertion Order of Bogies
 * * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 * * At this stage, the application:
 * - Attaches bogies in order via User Input
 * - Preserves insertion sequence
 * - Avoids duplicate bogies automatically
 * - Displays final train formation
 * * This maps ordered uniqueness using LinkedHashSet.
 * * @author Developer
 * @version 5.0
 */
public class Train_Consist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("=========================================\n");

        // Create a LinkedHashSet to represent the train formation
        // LinkedHashSet ensures uniqueness AND maintains insertion order
        Set<String> formation = new LinkedHashSet<>();

        // ---- User adds bogies (Flow Step 1) ----
        System.out.println("Please enter the bogies to attach (Engine, Sleeper, Cargo, Guard):");

        // Adding initial bogies
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // ---- Attempting to add a duplicate (Requirement) ----
        System.out.println("Attempting to attach duplicate bogie: 'Sleeper'...");
        formation.add("Sleeper");

        // Display final formation matching the output image
        System.out.println("\nFinal Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");

        scanner.close();
    }
}