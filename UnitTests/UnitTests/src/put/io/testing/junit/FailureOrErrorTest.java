package put.io.testing.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    @Test
    void test1() {
        assertEquals(1, 2);
    }

    @Test
    void test2() {
        throw new RuntimeException("Unexpected exception!");
    }

    @Test
    void test3() {
        try {
            assertEquals(1, 2);
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println(t.getClass().getName());
        }
    }
}