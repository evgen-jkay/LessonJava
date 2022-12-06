package java_easy_start.glava3;

/**
 * 5. Создайте программу, в которой объявлены 3 переменных типа boolean, со значениями
 * false, true, false. Создайте с ними следующие выражения:
 * а. Выражение обязательно должно содержать && и результат должен быть true.
 * б. Выражение обязательно должно содержать || и результат должен быть false.
 * в. Выражение обязательно должно содержать ^ и результат должен быть true. (подсказка:
 * почитайте про приоритеты логических операций в Java)
 */
public class Task_5 {
    public static void main(String[] args) {
        boolean isOk = false;
        boolean isBool = true;
        boolean isNot = false;

        System.out.println("а:" + (isBool && !isNot));
        System.out.println("б:" + (isOk || isNot));
        System.out.println("в:" + (isOk ^ isBool));
    }
}
