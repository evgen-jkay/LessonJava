package java_easy_start.glava4;

/**
 * 1. Напишите программу-анализатор времени года по  номеру месяца. В  ней должна
 * задаваться переменная month типа int. Значение этой переменной программа анализирует
 * и выдает время года, например, если month равно 1 – выведет «А сейчас-то зима!», если равно
 * 6 – «Лето красное!» и т.д., если же month больше 12 или меньше 1 выводит например «Вы
 * с другой планеты?».
 */
public class Task_1 {
    public static void main(String[] args) {
        int mouth = 13;

        if (mouth == 1) {
            System.out.println("А сейчас-то зима!");
        } else if (mouth == 6) {
            System.out.println("Лето красное!");
        } else if (mouth < 1 || mouth > 12) {
            System.out.println("Вы с другой планеты?");
        }
    }
}
