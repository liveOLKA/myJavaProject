package lesson2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(within10and20(2,19));
    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }
}
