import java.util.*;

public class Train_Consist_Management {

    // Method to validate Train ID (5 Digits)
    public static boolean validateTrainID(String trainID) {
        return trainID.matches("\\d{5}");
    }

    // Method to validate Cargo Code (3 Letters + 3 Digits)
    public static boolean validateCargoCode(String cargoCode) {
        return cargoCode.matches("[A-Z]{3}\\d{3}");
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC11 - Validate Train ID & Cargo Codes ");
        System.out.println("==============================================\n");

        String testID = "12345";
        String testCargo = "CRG999";

        System.out.println("Train ID " + testID + " valid? " + validateTrainID(testID));
        System.out.println("Cargo Code " + testCargo + " valid? " + validateCargoCode(testCargo));

        // Testing an invalid case
        String badID = "ABC12";
        System.out.println("Train ID " + badID + " valid? " + validateTrainID(badID));
    }
}