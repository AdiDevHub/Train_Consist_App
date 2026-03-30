import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

public class test {

    @Test
    void testSearch_BogieExists() {
        List<Train_Consist_Management.Bogie> list = Arrays.asList(
                new Train_Consist_Management.Bogie("Sleeper", 72),
                new Train_Consist_Management.Bogie("General", 90)
        );

        Optional<Train_Consist_Management.Bogie> result = list.stream()
                .filter(b -> b.name.equals("Sleeper"))
                .findFirst();

        assertTrue(result.isPresent(), "Bogie should be found");
        assertEquals(72, result.get().capacity);
    }

    @Test
    void testSearch_BogieDoesNotExist() {
        List<Train_Consist_Management.Bogie> list = Arrays.asList(
                new Train_Consist_Management.Bogie("Sleeper", 72)
        );

        Optional<Train_Consist_Management.Bogie> result = list.stream()
                .filter(b -> b.name.equals("Pantry"))
                .findFirst();

        assertFalse(result.isPresent(), "Search should return empty for non-existent bogie");
    }

    @Test
    void testSearch_EmptyList() {
        List<Train_Consist_Management.Bogie> list = new ArrayList<>();

        Optional<Train_Consist_Management.Bogie> result = list.stream()
                .filter(b -> b.name.equals("Sleeper"))
                .findFirst();

        assertTrue(result.isEmpty(), "Searching an empty list should return an empty Optional");
    }
}