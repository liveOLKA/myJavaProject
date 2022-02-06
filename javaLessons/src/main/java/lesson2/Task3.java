package lesson2;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isNegative(0));
    }

    public static boolean isNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }
}
