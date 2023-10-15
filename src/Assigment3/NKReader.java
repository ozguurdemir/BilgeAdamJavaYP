package Assigment3;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class NKReader
    {
        private String filePath;

        public NKReader(String path)
            {
                this.filePath = path;
            }
        public ArrayList<String> readWords()
            {
                ArrayList<String> words = new ArrayList<>();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                    int intChar;
                    StringBuilder word = new StringBuilder();
                    while ((intChar = bufferedReader.read()) != -1) {
                        char character = (char) intChar;
                        if (character != ' ' && character != '\n' ) {
                            word.append(character);
                        } else if (word.length() > 0) {
                            words.add(word.toString());
                            word.setLength(0);
                        }
                    }
                    if (word.length() > 0) {
                        words.add(word.toString());
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return words;
            }
        public String readLineAt(int row)
            {
                String line = null;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
                    for (int i = 0; i < row; i++) {
                        line = bufferedReader.readLine();
                    }
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return line;

            }
    }
