package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MyCodeTest {

    MyCode myCode = new MyCode();

    // Test Case 1: Test the "Positive" branch
    @Test
    void testPositiveBranch() {
        String result = myCode.Printme(1, 1);
        assertEquals("Positive", result);
    }

    // Test Case 2: Test the "Negative" branch
    @Test
    void testNegativeBranch() {
        String result = myCode.Printme(-1, -3);
        assertEquals("Negative", result);
    }
}