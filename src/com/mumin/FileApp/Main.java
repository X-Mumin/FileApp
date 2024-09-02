package com.mumin.FileApp;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("C:\\Users\\MUMIN\\Desktop\\test.txt");

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                System.out.println(file.getAbsolutePath());
            } else if (file.exists()) {
                System.out.println("File already exists.");
                System.out.println(file.getAbsolutePath());
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}