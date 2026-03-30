import java.util.*;

public class Train_Consist_Management {

    static class Bogie {
        int capacity;
        public Bogie(int capacity) { this.capacity = capacity; }
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println(" UC13 - Performance: Loops vs Streams ");
        System.out.println("==============================================\n");

        // 1. Prepare a large dataset (100,000 bogies)
        List<Bogie> largeConsist = new ArrayList<>();
        for (int i = 0; i < 100_000; i++) {
            largeConsist.add(new Bogie(72));
        }

        // 2. Benchmark Traditional Loop
        long startLoop = System.nanoTime();
        int totalLoop = 0;
        for (Bogie b : largeConsist) {
            totalLoop += b.capacity;
        }
        long endLoop = System.nanoTime();
        long loopDuration = endLoop - startLoop;

        // 3. Benchmark Stream API
        long startStream = System.nanoTime();
        int totalStream = largeConsist.stream().mapToInt(b -> b.capacity).sum();
        long endStream = System.nanoTime();
        long streamDuration = endStream - startStream;

        // 4. Results
        System.out.println("Total (Loop): " + totalLoop + " | Time: " + loopDuration + " ns");
        System.out.println("Total (Stream): " + totalStream + " | Time: " + streamDuration + " ns");

        if (loopDuration < streamDuration) {
            System.out.println("\nResult: Traditional Loop was faster by " + (streamDuration - loopDuration) + " ns");
        } else {
            System.out.println("\nResult: Stream API was faster by " + (loopDuration - streamDuration) + " ns");
        }
    }
}