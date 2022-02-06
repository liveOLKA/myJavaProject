package lesson2;

public class Task2 {
    public static void main(String[] args) {
        isPositiveOrNegative(-15);
    }

    public static void isPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Negative number");
        }
    }
}
