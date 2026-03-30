import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class test {

    @Test
    void testPerformance_ResultsMatch() {
        List<Train_Consist_Management.Bogie> list = Arrays.asList(
                new Train_Consist_Management.Bogie(10),
                new Train_Consist_Management.Bogie(20),
                new Train_Consist_Management.Bogie(30)
        );

        // Calculate using loop
        int loopTotal = 0;
        for (Train_Consist_Management.Bogie b : list) {
            loopTotal += b.capacity;
        }

        // Calculate using stream
        int streamTotal = list.stream().mapToInt(b -> b.capacity).sum();

        assertEquals(loopTotal, streamTotal, "Both methods must return the same total capacity");
    }
}