import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    @Test
    void testValidateTrainID() {
        // Valid case
        assertTrue(Train_Consist_Management.validateTrainID("55667"), "Should be valid: 5 digits");

        // Invalid cases
        assertFalse(Train_Consist_Management.validateTrainID("123"), "Too short");
        assertFalse(Train_Consist_Management.validateTrainID("123456"), "Too long");
        assertFalse(Train_Consist_Management.validateTrainID("A1234"), "Contains letters");
    }

    @Test
    void testValidateCargoCode() {
        // Valid case
        assertTrue(Train_Consist_Management.validateCargoCode("BOX456"), "Should be valid: 3 letters + 3 digits");

        // Invalid cases
        assertFalse(Train_Consist_Management.validateCargoCode("box456"), "Letters must be uppercase");
        assertFalse(Train_Consist_Management.validateCargoCode("B12345"), "Must start with 3 letters");
        assertFalse(Train_Consist_Management.validateCargoCode("CRG99"), "Digits must be exactly 3");
    }
}