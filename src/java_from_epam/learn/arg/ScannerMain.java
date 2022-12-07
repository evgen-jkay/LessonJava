package java_from_epam.learn.arg;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        System.out.println("Enter name and press <Enter> & number and press <Enter>:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello, " + name);
        int num = scanner.nextInt();
        System.out.println("number = " + num);
        scanner.close();
    }
}
