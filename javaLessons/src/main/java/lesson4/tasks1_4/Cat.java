package lesson4.tasks1_4;

public class Cat extends Animal {
    private static int count;
    private int runLimit = 200;
    private int swimLimit = 0;

    public Cat(String name) {
        super(name);
        setCount(count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count++;
        Cat.count = count;
        Animal.setCount(count);
    }

    public int getRunLimit() {
        return runLimit;
    }

    public int getSwimLimit() {
        return swimLimit;
    }

    @Override
    public void run(int distance) {
        if (distance <= getRunLimit()) {
            System.out.println(getName() + " run " + distance + " m.");
        } else {
            System.out.println("Cats don't run so much and " + getName() + " also.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cats can't swim and " + getName() + " also.");
    }
}

