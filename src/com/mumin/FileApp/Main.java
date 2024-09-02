package com.mumin.FileApp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File myFile = new File("file.txt");

        if (myFile.delete()) {

            System.out.println("Deleted the file: " + myFile.getName());

        } else {

            System.out.println("Failed to delete the file.");
        }

    }
}