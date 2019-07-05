package com.stackroute.pe2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

    public class PowerOfFourCheckerTest {

        public static PowerOfFourChecker powerOfFourChecker;

        @BeforeClass
        public static void setUp()
        {
            powerOfFourChecker = new PowerOfFourChecker();
        }

        @AfterClass
        public static void tearDown()
        {
            powerOfFourChecker = null;
        }

        @Test
        public void testForPowerOf4Success()
        {
            assertEquals(true, powerOfFourChecker.isNumberPowerOf4(1048576));

            assertEquals(true, powerOfFourChecker.isNumberPowerOf4(256));

            //assertEquals(true, powerOfFourChecker.isNumberPowerOf4(0.25));

        }

        @Test
        public void testForPowerOf4Failure()
        {
            assertEquals(false, powerOfFourChecker.isNumberPowerOf4(1048580));

            assertEquals(false, powerOfFourChecker.isNumberPowerOf4(20));

            assertEquals(false, powerOfFourChecker.isNumberPowerOf4(-4));

            assertEquals(false, powerOfFourChecker.isNumberPowerOf4(0));

        }
    }

