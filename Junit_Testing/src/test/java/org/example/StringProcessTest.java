package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessTest {

    StringProcess sp = new StringProcess();

    @Test
    void testConcatenate() {
        assertEquals("HelloWorld", sp.concatenate("Hello", "World"));
    }

    @Test
    void testConcatenateNullFirst() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            sp.concatenate(null, "World");
        });

        assertEquals("Strings cannot be null", exception.getMessage());
    }

    //  Test concatenate when second string is null
    @Test
    void testConcatenateNullSecond() {
        assertThrows(IllegalArgumentException.class, () -> {
            sp.concatenate("Hello", null);
        });
    }

    // Test palindrome true
    @Test
    void testPalindromeTrue() {
        assertTrue(sp.Ispalindrome("madam"));
    }

    // Test palindrome false
    @Test
    void testPalindromeFalse() {
        assertFalse(sp.Ispalindrome("hello"));
    }

    //  Test palindrome null
    @Test
    void testPalindromeNull() {
        assertFalse(sp.Ispalindrome(null));
    }
}
