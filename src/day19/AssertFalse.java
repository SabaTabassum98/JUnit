package day19;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;



@DisplayName("Write assertions for booleans")
class AssertFalse {
 
    @Nested
    @DisplayName("When boolean is false")
    class WhenBooleanIsFalse {
 
        @Test
        @DisplayName("Should be false")
        void shouldBeFalse() {
            assertFalse(false);
        }
    }
}
