import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class Train_Consist_ManagementTest {

    @Test
    void testSortingLogic() {
        // Arrange: Create a list in random order
        List<Train_Consist_Management.Bogie> testList = new ArrayList<>();
        testList.add(new Train_Consist_Management.Bogie("Large", 100));
        testList.add(new Train_Consist_Management.Bogie("Small", 10));

        // Act: Sort the list
        testList.sort(Comparator.comparingInt(b -> b.capacity));

        // Assert: Check if the first item is the smallest
        assertEquals(10, testList.get(0).capacity, "The smallest capacity should be first.");
        assertEquals("Small", testList.get(0).name);
    }
}