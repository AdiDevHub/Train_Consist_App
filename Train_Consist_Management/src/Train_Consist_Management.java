import java.util.*;

public class Train_Consist_Management {

    static class GoodsBogie {
        String id;
        double currentWeight;
        double maxLimit;

        public GoodsBogie(String id, double currentWeight, double maxLimit) {
            this.id = id;
            this.currentWeight = currentWeight;
            this.maxLimit = maxLimit;
        }

        // UC12 Logic: Safety Check
        public boolean isSafetyCompliant() {
            return currentWeight <= maxLimit;
        }

        @Override
        public String toString() {
            return "Bogie " + id + " [Weight: " + currentWeight + "/" + maxLimit + "]";
        }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC12 - Safety Compliance Check (Goods) ");
        System.out.println("==============================================\n");

        List<GoodsBogie> inventory = new ArrayList<>();
        inventory.add(new GoodsBogie("G101", 45.5, 50.0)); // Compliant
        inventory.add(new GoodsBogie("G102", 55.0, 50.0)); // Overloaded

        for (GoodsBogie bogie : inventory) {
            System.out.print(bogie);
            if (bogie.isSafetyCompliant()) {
                System.out.println(" -> SAFE");
            } else {
                System.out.println(" -> DANGER: OVERLOADED");
            }
        }

        System.out.println("\nUC12 compliance check completed...");
    }
}