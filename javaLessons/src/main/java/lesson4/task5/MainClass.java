package lesson4.task5;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Murzik", 30);
        cat[1] = new Cat("Murka", 25);
        cat[2] = new Cat("Simka", 70);
        Plate plate = new Plate(10);
        plate.info();
        plate.increaseFood(100);
        plate.info();
        System.out.println();
        for (Cat c : cat) {
            c.eat(plate);
            c.info();
            plate.info();
            System.out.println();
        }
    }
}











