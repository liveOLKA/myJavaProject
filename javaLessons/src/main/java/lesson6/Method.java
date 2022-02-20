package lesson6;

public class Method {
    public static void methodSum(String[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array.length != 4 || array[i].length != 4) {
                    throw new MyArraySizeException("Invalid array size");
                }
                if (array[i][j].matches("[-+]?\\d+")) {
                    sum += Integer.parseInt(array[i][j]);
                } else {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("The sum of all elements is: " + sum);
    }
}
