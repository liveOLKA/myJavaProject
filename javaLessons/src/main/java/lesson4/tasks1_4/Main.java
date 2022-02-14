package lesson4.tasks1_4;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Murzik");
        Animal cat2 = new Cat("Simka");
        Animal dog1 = new Dog("Bobik");
        Animal dog2 = new Dog("Muxtar");
        Animal dog3 = new Dog("Tuzik");

        cat1.run(150);
        cat1.swim(2);
        cat2.run(250);
        cat2.swim(1);
        dog1.run(400);
        dog1.swim(8);
        dog2.run(600);
        dog2.swim(15);
        dog3.run(20);
        dog3.swim(11);
        System.out.println("Total cats: " + Cat.getCount());
        System.out.println("Total dogs: " + Dog.getCount());
        System.out.println("Total animals: " + Animal.getCount());

    }
}
