package lesson5;

import java.util.Arrays;

public class Method {
    static void swap(String[] array, int firstIndex, int secondIndex) {
        String temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        String[] array = new String[4];
        array[0] = "BMW";
        array[1] = "Audi";
        array[2] = "Nissan";
        array[3] = "Toyota";
        System.out.println(Arrays.toString(array));
        swap(array, 0, 1);
    }
}
