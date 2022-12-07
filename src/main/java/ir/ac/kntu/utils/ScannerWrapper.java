package ir.ac.kntu.utils;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerWrapper {
    private static Scanner scanner = new Scanner(System.in);

    public static void setInputStream(InputStream inputStream) {
        scanner = new Scanner(inputStream);
    }

    public static String readLine() {
        return scanner.nextLine();
    }

    public static Scanner getScanner() {
        return scanner;
    }
}
