package com.mumin.FileApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter myWriter = new FileWriter("file.txt");

            myWriter.write("Hello, World!");
            myWriter.close();

            System.out.println("Done");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}