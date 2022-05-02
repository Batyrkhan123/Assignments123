package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File("Exercise17_01.txt");

        boolean append = file.exists();

        try (PrintWriter printWriter = new PrintWriter(new BufferedOutputStream(new FileOutputStream(file, append)))) {

            for (int i = 0; i < 100; i++) {
                printWriter.write((int) (Math.random() * (Integer.MAX_VALUE + 1L)) + " ");
            }
        }
    }
}