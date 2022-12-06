package learn_java_easy_way.ch06;

import java.util.Scanner;

public class SecretMessages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a message to encode or decode:");
        String message = scanner.nextLine();
        String output = "";
        String output2 = "";
        String output3 = "";
        char key = 13;

        for (int x = message.length() - 1; x >= 0; x--) {
            output += message.charAt(x);
        }

        for (int x = 0; x < message.length(); x++) {
            output2 += (char) (message.charAt(x) + key);
        }

        for (int i = 0; i < message.length(); i++) {
            char input = message.charAt(i);

            if (input >= 'A' && input <= 'Z') {
                input += key;
                if (input > 'Z')
                    input -= 26;
            }
            output3 += input;
        }
        System.out.println("Variant 1: " + output);
        System.out.println("Variant 2: " + output2);
        System.out.println("Variant 3: " + output3);

        scanner.close();
    }
}
