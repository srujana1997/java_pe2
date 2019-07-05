package com.stackroute.pe2;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

    public class GradeCalculatorTest {

        public static GradeCalculator gradeCalculator;

        @BeforeClass
        public static void setUp()
        {
            gradeCalculator = new GradeCalculator();
        }

        @AfterClass
        public static void tearDown()
        {
            gradeCalculator = null;
        }

        @Test
        public void testForGradeCalculatorSuccess()
        {
            int[] grades = {80,70,60,78};
            gradeCalculator.calculateGrades(4,grades);
            assertEquals("GradeCalculator{average=72.0, minimum=60, maximum=80}", gradeCalculator.toString());
        }

        @Test
        public void testForGradeCalculatorFailureWithInvalidInput()
        {
            int[] grades = {80,70,60,78,67};
            assertEquals("grades must be equal to number of students",gradeCalculator.calculateGrades(4,grades));
            assertEquals("GradeCalculator{average=0.0, minimum=0, maximum=0}", gradeCalculator.toString());

        }

        @Test
        public void testForGradeCalculatorFailureWithOutOfRangeInput()
        {
            int[] grades = {80,70,60,178};
            assertEquals("grades must not be in between 0 and 100",gradeCalculator.calculateGrades(4,grades));
            assertEquals("GradeCalculator{average=0.0, minimum=0, maximum=0}", gradeCalculator.toString());
        }


}