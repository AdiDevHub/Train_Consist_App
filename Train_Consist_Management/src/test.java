import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void testBogie_ValidCapacity() {
        assertDoesNotThrow(() -> {
            new Train_Consist_Management.Bogie("Sleeper", 72);
        }, "Valid capacity should not throw an exception");
    }

    @Test
    void testBogie_NegativeCapacityThrowsException() {
        // Verify that the custom exception is thrown
        Exception exception = assertThrows(InvalidBogieCapacityException.class, () -> {
            new Train_Consist_Management.Bogie("ErrorBogie", -1);
        });

        String expectedMessage = "Capacity cannot be negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage), "Error message should mention negative capacity");
    }
}