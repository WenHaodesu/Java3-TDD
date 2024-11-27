package colourtable;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ColourTableTest {

    // Use parameterized testing to test invalid parameters.
    @ParameterizedTest
    @ValueSource(ints = { -1, 3 }) // Provide illegal parameters.
    void testInvalidParameters(int parameter) {
        assertThrows(IllegalArgumentException.class, () -> new ColourTable(parameter));
    }

    // Use parameterized testing to test valid parameters.
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 2 }) // Provide legal parameters.
    void testValidParameters(int parameter) {
        // Legal parameters will not throw an exception.
        assertDoesNotThrow(() -> new ColourTable(parameter));
    }
}



