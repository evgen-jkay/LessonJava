package learn_java_easy_way.ch06;

import java.util.Scanner;

public class SecretMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to encode or decode:");
        String message = scanner.nextLine();
        String output = "";

        for (int x = message.length() - 1; x >= 0; x--) {
            output += message.charAt(x);
        }

        System.out.println(output);
    }
}
