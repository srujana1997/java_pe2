package com.stackroute.pe2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;

//Write a program to find all files of a folder and select only given extention fileName and
//read content of this file using byte array

    public class FolderFileNamesReader {
        public String[] getFolderFilenames(String filepath, String extention)
        {
            try {

                File folder = new File(filepath);

                int i = 0;

                //filter files only with given extension

                File[] files = folder.listFiles(new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                        return name.toLowerCase().endsWith("." + extention);
                    }
                });

                String[] filenames = new String[files.length];

                for (File file : files) {

                    filenames[i++] = file.getName();

                    FileInputStream fileInputStream = new FileInputStream(file);

                    byte byteFileContent[] = new byte[(int) file.length()];

                    fileInputStream.read(byteFileContent);   //read content into byte array

                    String fileContent = new String(byteFileContent);

                    System.out.println(fileContent);
                }

                return filenames;

            }catch (Exception exception)
            {
                return null;
            }
        }

}
