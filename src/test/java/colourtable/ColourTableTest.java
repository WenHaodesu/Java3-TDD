package colourtable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColourTableTest {

    @Test
    void testColourTableConstructor() {
        // Test for invalid parameters and make sure the constructor throws an IllegalArgumentException.
        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(-1);  // Invalid parameter provided: -1
        });

        assertThrows(IllegalArgumentException.class, () -> {
            new ColourTable(3);  // Invalid parameter provided: 3
        });

        // Test valid parameters to ensure that no exceptions are thrown.
        assertDoesNotThrow(() -> {
            new ColourTable(0);  // Provide valid parameter: 0
        });

        assertDoesNotThrow(() -> {
            new ColourTable(1);  // Provide valid parameter: 1
        });

        assertDoesNotThrow(() -> {
            new ColourTable(2);  // Provide valid parameter: 2
        });
    }
}


