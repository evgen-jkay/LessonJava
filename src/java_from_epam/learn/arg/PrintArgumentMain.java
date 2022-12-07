package java_from_epam.learn.arg;

public class PrintArgumentMain {
    public static void main(String[] args) {
        for (String str : args) {
            System.out.println("Argument--> %s%n", str);
        }
    }
}
