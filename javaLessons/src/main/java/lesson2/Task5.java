package lesson2;

public class Task5 {
    public static void main(String[] args) {
        invertArray();
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.print(array[i] + " ");
        }
    }
}
