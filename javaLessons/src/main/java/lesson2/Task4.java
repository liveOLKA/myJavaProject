package lesson2;

public class Task4 {
    public static void main(String[] args) {
        printStrN("Hello everyone!", 5);
    }

    public static void printStrN(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(str);
        }
    }
}
