package ru.geekbrains.lesson6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class HomeWork {

    static Random random = new Random();

    public static StringBuilder textGenerator(){
        String[] words = {"hello", "buddy", "how", "are", "you"};
        StringBuilder stringText = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            stringText.append(words[random.nextInt(words.length)]);
        }
       return stringText;
    }

    public static void createFile(String name)throws FileNotFoundException {
            PrintStream file = new PrintStream(new FileOutputStream(name, true));
            file.println(textGenerator());
            file.close();
    }

    public static void combineFile(String name1, String name2) throws FileNotFoundException {
        Scanner scanner1 = new Scanner(new FileInputStream(name1));
        Scanner scanner2 = new Scanner(new FileInputStream(name2));
        while (scanner1.hasNext() & scanner2.hasNext()) {
            PrintStream file = new PrintStream(new FileOutputStream("Test3.txt", true));
            file.println(scanner1.next() + scanner2.next());
            file.close();
        }
    }

    public static boolean findWord(String name, String word) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream(name));
        while (scanner.hasNext()){
            if(scanner.next().contains(word)) return true;
        } return false;
    }

    public static void main(String[] args) throws IOException {
        InputStream in;
        OutputStream out;
        createFile("Test1.txt");
        createFile("Test2.txt");
        combineFile("Test1.txt", "Test2.txt");
        System.out.println(findWord("Test1.txt", "hello"));
    }
}

