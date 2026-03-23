import java.util.LinkedList;
import java.util.Scanner;

/**
 * =======================================================
 * MAIN CLASS - UseCase4TrainConsistMgmnt
 * =======================================================
 * Use Case 4: Maintain Ordered Bogie Consist
 * * Description:
 * This class models the physical chaining of train bogies
 * using LinkedList for ordered operations.
 * * At this stage, the application:
 * - Adds bogies in sequence via User Input
 * - Inserts bogies at specific positions
 * - Removes bogies from front and rear
 * - Displays updated train structure
 * * @author Developer
 * @version 4.0
 */
public class Train_Consist {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> trainConsist = new LinkedList<>();

        System.out.println("=========================================");
        System.out.println(" UC4 - Maintain Ordered Bogie Consist ");
        System.out.println("=========================================\n");

        // ---- User adds bogie IDs (Flow Step 1 & 2) ----
        System.out.println("Enter 5 bogies to initialize the train (e.g., Engine, Sleeper, AC, Cargo, Guard):");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Bogie " + (i + 1) + ": ");
            trainConsist.add(scanner.nextLine());
        }

        System.out.println("\nInitial Train Consist:");
        System.out.println(trainConsist);

        // ---- Positional Insertion ----
        System.out.print("\nEnter a bogie to insert at position 2 (e.g., Pantry Car): ");
        String specialBogie = scanner.nextLine();
        trainConsist.add(2, specialBogie);

        System.out.println("After Inserting '" + specialBogie + "' at position 2:");
        System.out.println(trainConsist);

        // ---- Front and Rear Removal ----
        System.out.println("\nAfter Removing First and Last Bogie:");
        if (!trainConsist.isEmpty()) {
            trainConsist.removeFirst();
            trainConsist.removeLast();
        }
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
        scanner.close();
    }
}