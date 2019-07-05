package com.stackroute.pe2;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

    public class FileReaderUpperCaseTest {

        public static FileReaderUpperCase fileReaderUpperCase;

        @BeforeClass
        public static void setUp()
        {
            fileReaderUpperCase = new FileReaderUpperCase();
        }

        @AfterClass
        public static void tearDown()
        {
            fileReaderUpperCase = null;
        }

        @Test
        public void testForgivingPdfFilePathAndReturnLength()
        {
            assertEquals(59, fileReaderUpperCase.fileReader("/home/srujana/Documents/srujana/sjn.pdf"));
        }

        @Test
        public void testForgivingTextFilePathAndReturnLength()
        {
            assertEquals(126, fileReaderUpperCase.fileReader("/home/srujana/Documents/srujana/sjn.txt"));
        }

        @Test
        public void testForgivingInCorrectFilePath()
        {
            assertEquals(0, fileReaderUpperCase.fileReader("/home/srujana/Documents/sjn.txt"));
        }

}