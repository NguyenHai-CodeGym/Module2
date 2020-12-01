import static org.junit.jupiter.api.Assertions.*;

class NextDayCaculatorTest {

    @org.junit.jupiter.api.Test
    void testNextDayCaculator() {
        String date = "31/1/2020";
        String expected = "1/2/2020";

        String result = NextDayCaculator.nextDayCaculator(date);
        assertEquals(expected,result);
    }
}