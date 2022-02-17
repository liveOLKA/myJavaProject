package lesson5.task2;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        appleBox.addFruit(new Apple(), 30);
        orangeBox.addFruit(new Orange(), 25);
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        System.out.println("Initial weight of boxes:");
        System.out.println("The first box with apples: " + appleBox.getWeight());
        System.out.println("The first box with oranges: " + orangeBox.getWeight());
        System.out.println(appleBox.compare(orangeBox));
        appleBox.pour(appleBox2);
        System.out.println("After pouring apples:");
        System.out.println("Weight of the first box: " + appleBox.getWeight());
        System.out.println("Weight of the second box: " + appleBox2.getWeight());
        orangeBox.pour(orangeBox2);
        System.out.println("After pouring oranges:");
        System.out.println("Weight of the first box: " + orangeBox.getWeight());
        System.out.println("Weight of the second box: " + orangeBox2.getWeight());
    }
}