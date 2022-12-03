package learn_java_easy_way.ch02;

import java.util.Scanner;

/** Задача № 3: Игра в чепуху.
 * Ваша задача состоит в том, чтобы написать новую программу
 * learn_java_easy_way.ch02.MadLibs.java с классом learn_java_easy_way.ch02.MadLibs и методом main(), которая запрашивает у пользователя несколько слов. Каждое из этих слов должно храниться в собственной переменной типа String, например
 * color, pastTenseVerb, adjective и noun, которые вы инициализируете как пустые строки. Затем, после того как пользователь
 * ввел все слова, программа должна вывести на экран завершенное
 * предложение или историю, заменив пустые строки введенными
 * словами.
 */
public class MadLibs {
    public static void main(String[] args) {
        String color, pastTenseVerb, adjective, noun;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter color:");
        color = scanner.next();
        System.out.println("Enter past tense verb:");
        pastTenseVerb = scanner.next();
        System.out.println("Enter adjective:");
        adjective = scanner.next();
        System.out.println("Enter noun:");
        noun = scanner.next();

        System.out.print("The " + color + " dragon " + pastTenseVerb + " at the " + adjective);
        System.out.println(" knight, who rode in on a sturdy, giant " + noun + ".");
    }
}
