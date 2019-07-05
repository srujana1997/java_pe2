package com.stackroute.pe2;
//program to read the content of a text file, convert the content in upper case
//and print the same in console along with the length of the file
import java.io.FileReader;

public class FileReaderUpperCase {
        public int fileReader(String filePath)
        {
            try {

                int i;
                int length =0;

                FileReader fileReader = new FileReader(filePath);

                while((i = fileReader.read()) != -1)  //reading file till the EOF
                {
                    System.out.print(Character.toUpperCase((char)i));
                    length ++;
                }

                return length;
            }
            catch (Exception exception)
            {
                return 0;
            }
        }
}

