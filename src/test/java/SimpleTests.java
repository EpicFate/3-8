import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(2 + 3, 5);
    }

    @Test
    void negativeTest() {
        assertEquals(3 * 3, 1);
    }
}