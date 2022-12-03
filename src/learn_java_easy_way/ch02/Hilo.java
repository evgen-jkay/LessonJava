package learn_java_easy_way.ch02;

import java.util.Scanner;

/**
 * Задача № 1: Расширение диапазона
 * Измените игру «Больше-Меньше» таким образом, чтобы можно
 * было использовать больший диапазон чисел. Вместо числа
 * от 1 до 100 предложите пользователю угадать число в диапазоне
 * от –100 до 100!
 * ---
 * Задача № 2: Подсчет попыток.
 * Ваша задача — подсчитать и сообщить о том, сколько попыток потребовалось пользователю, чтобы угадать число.
 * ---
 * Задача № 3: Игра в чепуху
 */

public class Hilo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;

        do {
            int numberOfTries = 0;
            int theNumber = (int) ((Math.random() * 200 + 1) - 100);
            int guess = 0;

            System.out.println("!!! " + theNumber + " !!!");

            while (guess != theNumber) {
                numberOfTries++;
                System.out.println("Guess number between -100 and 200:");
                guess = scan.nextInt();
                System.out.println("You entered " + guess + ".");

                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is correct. You win!");
                    System.out.println("It only took you " + numberOfTries + " tries! Good work");
                }
            }

            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you playing! Goodbye.");
        scan.close();
    }
}
