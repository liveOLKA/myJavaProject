package lesson4.tasks1_4;

public class Dog extends Animal {
    static int count;
    private int runLimit = 500;
    private int swimLimit = 10;

    public Dog(String name) {
        super(name);
        setCount(count);
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        count++;
        Dog.count = count;
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
            System.out.println("Dogs don't run so much and " + getName() + " also.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= getSwimLimit()) {
            System.out.println(getName() + " swam " + distance + " m.");
        } else {
            System.out.println("Dogs don't swim so much and " + getName() + " also.");
        }
    }
}