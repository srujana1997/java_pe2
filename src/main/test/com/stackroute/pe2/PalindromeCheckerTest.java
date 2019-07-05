package com.stackroute.pe2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

    public class PalindromeCheckerTest {

        public static PalindromeChecker palindromeChecker;

        @BeforeClass
        public static void setUp()
        {
            palindromeChecker = new PalindromeChecker();
        }

        @AfterClass
        public static void tearDown()
        {
            palindromeChecker = null;
        }

        @Test
        public void givenStringShouldBeAPalindrome(){

            assertEquals(true, palindromeChecker.isPalindrome("101"));

            assertEquals(true, palindromeChecker.isPalindrome("sos"));

            assertEquals(true, palindromeChecker.isPalindrome("abcd@dcba"));

            assertEquals(true, palindromeChecker.isPalindrome(""));

        }

        @Test
        public void givenStringShouldNotBeaPalindrome(){

            assertEquals(false, palindromeChecker.isPalindrome("1232"));

            assertEquals(false, palindromeChecker.isPalindrome("srujana"));

            assertEquals(false, palindromeChecker.isPalindrome("abcd@dcba0"));

            assertEquals(false, palindromeChecker.isPalindrome(null));

        }


}