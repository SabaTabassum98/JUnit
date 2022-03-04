package day19;

// assertTrue method

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
 
import static org.junit.jupiter.api.Assertions.assertTrue;
 
@DisplayName("Write assertions for booleans")
public class AssertTrue {
 
    @Nested
    @DisplayName("When boolean is true")
    class WhenBooleanIsTrue {
 
        @Test
        @DisplayName("Should be true")
        void shouldBeTrue() {
            assertTrue(true);
        }
    }
}
 