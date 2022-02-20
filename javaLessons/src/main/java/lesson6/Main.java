package lesson6;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"11", "12", "13", "14"}, {"15", "16", "17", "18"}, {"19", "20", "21", "22"}, {"23", "24", "25", "26"}};
        try {
            Method.methodSum(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.printf("Incorrect data in the cell [%d][%d]", e.i, e.j);
        }
    }
}
