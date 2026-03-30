import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void testSafety_WithinLimit() {
        Train_Consist_Management.GoodsBogie safeBogie =
                new Train_Consist_Management.GoodsBogie("TEST01", 40.0, 50.0);

        assertTrue(safeBogie.isSafetyCompliant(), "Bogie within limit should be compliant");
    }

    @Test
    void testSafety_OverLimit() {
        Train_Consist_Management.GoodsBogie heavyBogie =
                new Train_Consist_Management.GoodsBogie("TEST02", 60.0, 50.0);

        assertFalse(heavyBogie.isSafetyCompliant(), "Bogie exceeding limit should NOT be compliant");
    }

    @Test
    void testSafety_ExactlyAtLimit() {
        Train_Consist_Management.GoodsBogie limitBogie =
                new Train_Consist_Management.GoodsBogie("TEST03", 50.0, 50.0);

        assertTrue(limitBogie.isSafetyCompliant(), "Bogie exactly at the limit should still be compliant");
    }
}