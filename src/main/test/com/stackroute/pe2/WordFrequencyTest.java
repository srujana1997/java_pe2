package com.stackroute.pe2;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

    public class WordFrequencyTest {

        public static WordFrequency wordFrequency;

        @BeforeClass
        public static void setUp()
        {
            wordFrequency = new WordFrequency();
        }

        @AfterClass
        public static void tearDown()
        {
            wordFrequency = null;
        }

        @Test
        public void testForWordFrequency()
        {
            List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/srujana/Documents/srujana/sjn.txt");
            assertEquals(8, result.size());
            assertEquals("filereaderuppercase\n" +
                    "filereaderuppercasetest\n" +
                    "pe2", result.get(0).word);
            assertEquals(1, result.get(0).count);
            assertEquals("assignment\n" +
                    "file", result.get(1).word);
            assertEquals(1, result.get(1).count);
        }

        @Test
        public void testForWordFrequencyFailure()
        {
            List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/srujana/Documents/sjn.txt");
            assertNull(null,result);
        }

        @Test
        public void testForWordFrequencySuccess()
        {
            List<WordFrequency.WordCount> result = wordFrequency.findWordfrequency("/home/srujana/Documents/srujana/sjn.txt");
            assertEquals("assignment\n" +
                    "file", result.get(1).word);
            assertEquals(1, result.get(1).count);
        }

    }

