package lesson4.tasks1_4;

public abstract class Animal {
    private String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Animal.count = Cat.getCount() + Dog.getCount();
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);
}


