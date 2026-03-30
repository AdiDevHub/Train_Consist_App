import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import java.util.stream.Collectors;

public class test {

    @Test
    void testFilter_CapacityGreaterThanThreshold() {
        // Prepare data
        List<Train_Consist_Management.Bogie> list = Arrays.asList(
                new Train_Consist_Management.Bogie("High", 80),
                new Train_Consist_Management.Bogie("Low", 20)
        );

        // Filter data using Streams
        List<Train_Consist_Management.Bogie> result = list.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        // Assertions
        assertEquals(1, result.size());
        assertEquals("High", result.get(0).name);
    }
}