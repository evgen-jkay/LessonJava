package java_from_epam.learn.console;

import java.io.IOException;

public class ReadCharMain {
    public static void main(String[] args) {
        int x;
        try {
            x = System.in.read();
            char c = (char) x;
            System.out.println("Character Code: " + c + " = " + x);
        } catch (IOException e) {
            System.out.println("I\\o error " + e);
        }
    }
}
