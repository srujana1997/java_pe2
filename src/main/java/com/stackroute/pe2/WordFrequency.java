package com.stackroute.pe2;
//program to calculate the frequency of the words in a given file
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;
import java.util.stream.Stream;

    public class WordFrequency {

        public class WordCount
        {
            String word;
            int count;
        }

        public List<WordCount> findWordfrequency(String filePath)
        {
            try {

                int i;

                FileReader fileReader = new FileReader(filePath);

                List<WordCount> wordCountList = new ArrayList<>();

                String fileContent = "";

                while((i = fileReader.read()) != -1)
                {
                    fileContent += (char)i;
                }

                String words[] = fileContent.split(" ");

                int wordCount = 0;

                Stream<String> distinctWords = Arrays.stream(words).distinct();   //to get distinct words

                String[] distinctWordsArray = distinctWords.toArray(String[]::new);

                for (int k =0; k<distinctWordsArray.length; k++) {

                    for(int j=0; j < words.length ; j++)  // get count of each word
                    {
                        if(distinctWordsArray[k].trim().contentEquals(words[j].trim()))
                        {
                            wordCount++;
                        }
                    }
                    WordCount eachWordCount = new WordCount();

                    eachWordCount.word = distinctWordsArray[k];

                    eachWordCount.count = wordCount;

                    wordCountList.add(eachWordCount);

                    wordCount = 0;
                }

                return wordCountList;
            }
            catch (Exception exception)
            {
                return null;
            }
        }
    }

