package com.stackroute.pe2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
        @Test
        public void givenNumberShouldBeAnEvenNumber()
        {
            assertEquals(true, EvenNumTest.isEven(24));
            assertEquals(true, EvenNumTest.isEven(0));
            assertEquals(true, EvenNumTest.isEven(-6524));
        }

        @Test
        public void givenNumberShouldNotBeAnEvenNumber()
        {
            assertEquals(false, EvenNumTest.isEven(245));
            assertEquals(false, EvenNumTest.isEven(987654287));
            assertEquals(false, EvenNumTest.isEven(-65249));
        }
}

