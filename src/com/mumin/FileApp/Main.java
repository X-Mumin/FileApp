package com.mumin.FileApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            File file = new File("file.txt");

            if (file.exists()) {
                System.out.println("File already exists.");
                System.out.println("File name: " + file.getName());
                System.out.println("Absolute path: " + file.getAbsolutePath());
                System.out.println("Writable: " + file.canWrite());
                System.out.println("Readable: " + file.canRead());
                System.out.println("File size in bytes: " + file.length());
            }

            else {
                System.out.println("the file does not exist");
            }


    }
}