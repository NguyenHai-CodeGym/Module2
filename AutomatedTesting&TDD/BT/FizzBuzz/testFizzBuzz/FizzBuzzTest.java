import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test
    void testfizzBuzz() {
        int number = 3;
        String expected = "Fizz";

        String result = FizzBuzz.FizzBuzz(number);
        assertEquals(result,expected);
    }
    @org.junit.jupiter.api.Test
    void testfizzBuzz1() {
        int number = 30;
        String expected = "Ba mươi";

        String result = FizzBuzz.WriteNum(number);
        assertEquals(result,expected);
    }
    
}