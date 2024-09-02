package com.mumin.FileApp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Before Formatting: " + dateTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MMM/E hh:mm:ss");
        String formattedDate = dtf.format(dateTime);
        System.out.println("After Formatting: " + formattedDate);

    }
}