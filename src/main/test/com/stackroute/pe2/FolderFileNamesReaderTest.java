package com.stackroute.pe2;
import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
    public class FolderFileNamesReaderTest {
        public static FolderFileNamesReader folderFileNamesReader;
        @BeforeClass
        public static void setUp()
        {
            folderFileNamesReader = new FolderFileNamesReader();
        }
        @AfterClass
        public static void tearDown()
        {
            folderFileNamesReader = null;
        }
        @Test()
        public void testForGetTextFilenamesOfFolder()
        {
            String[] filenames = folderFileNamesReader.getFolderFilenames("/home/srujana/Documents/srujana", "txt");

            assertEquals(1,filenames.length);

            assertEquals("sjn.txt", filenames[0]);
        }

        @Test()
        public void testForGetPdfFilenamesOfFolder()
        {
            String[] filenames = folderFileNamesReader.getFolderFilenames("/home/srujana/Documents/srujana", "pdf");

            assertEquals(1,filenames.length);

            assertEquals("sjn.pdf", filenames[0]);
        }


        @Test()
        public void testForGetFilenamesOfFolderFailure()
        {
            String[] filenames = folderFileNamesReader.getFolderFilenames("/home/srujana/Documents/Dummy", "pdf");

            assertNull(null,filenames);

        }
    }
