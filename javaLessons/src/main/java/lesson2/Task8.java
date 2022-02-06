package lesson2;

public class Task8 {
    public static void main(String[] args) {
        fillDiagonal();
    }

    public static void fillDiagonal() {
        int[][] array = new int[7][7];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0, n = array[i].length - 1; j < array[i].length; j++, n--) {
                if (i == j || i == n) {
                    array[i][j] = 1;
                } else array[i][j] = 0;
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}







