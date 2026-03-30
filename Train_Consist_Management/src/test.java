import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class test {

    @Test
    void testTotalSeats_Calculation() {
        List<Train_Consist_Management.Bogie> list = Arrays.asList(
                new Train_Consist_Management.Bogie("S1", 50),
                new Train_Consist_Management.Bogie("S2", 50)
        );

        int total = list.stream().mapToInt(b -> b.capacity).sum();

        assertEquals(100, total, "The sum of 50 + 50 should be 100");
    }

    @Test
    void testTotalSeats_EmptyList() {
        List<Train_Consist_Management.Bogie> emptyList = new ArrayList<>();

        int total = emptyList.stream().mapToInt(b -> b.capacity).sum();

        assertEquals(0, total, "An empty train should have 0 seats");
    }
}