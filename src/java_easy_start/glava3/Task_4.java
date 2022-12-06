package java_easy_start.glava3;

/**
 * 4. Создайте программу, в которой объявлены 2 переменные типа int и необходимо найти
 * остаток от деления одного числа на другое, не используя встроенную функцию нахождения
 * модуля в Java. Результаты выведите на экран.
 */
public class Task_4 {
    public static void main(String[] args) {
        int num = 7;
        int num2 = 2;

        int res = num % num2;

        System.out.println(res);
    }
}
