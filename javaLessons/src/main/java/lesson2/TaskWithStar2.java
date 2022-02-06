package lesson2;

import java.util.Arrays;

public class TaskWithStar2 {
    public static void main(String[] args) {
        fillArrays(5, 6);
    }

    public static void fillArrays(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }
}

