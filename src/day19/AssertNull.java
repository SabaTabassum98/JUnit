package day19;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNull;
 
 
	
@DisplayName("Writing assertions for objects")
class AssertNull  {
 
    @Nested
    @DisplayName("When object is null")
    class WhenObjectIsNull {
 
        @Test
        @DisplayName("Should be null")
        void shouldBeNull() {
            assertNull(null);
        }
    }
}



