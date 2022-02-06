package lesson2;

import java.util.Arrays;

public class TaskWithStar3 {
    public static void main(String[] args) {
        int[] array = {1, 5, 8, 7, 12, 45, 7, 65};
        shiftArray(array, -3);
        System.out.println(Arrays.toString(array));
    }

    public static int[] shiftArray(int[] array, int n) {
        if (n < 0) {
            leftShiftArray(array, n);
        } else {
            rightShiftArray(array, n);
        }
        return array;
    }

    public static int[] leftShiftArray(int[] array, int n) {
        int length = array.length;
        int current;
        int next;
        n *= -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                current = array[j];
                next = j + 1;
                if (j + 1 > length - 1) {
                    next = 0;
                }
                array[j] = array[next];
                array[next] = current;
            }
        }
        return array;
    }

    public static int[] rightShiftArray(int[] array, int n) {
        int length = array.length - 1;
        int current;
        int previous;

        for (int i = 0; i < n; i++) {
            for (int j = length; 0 <= j; j--) {
                current = array[j];
                previous = j - 1;
                if (j - 1 < 0) {
                    previous = 0;
                }
                array[j] = array[previous];
                array[previous] = current;
            }
        }
        return array;
    }
}

