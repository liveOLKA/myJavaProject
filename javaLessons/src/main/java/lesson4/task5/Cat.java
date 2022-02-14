package lesson4.task5;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean isSatiety() {

        return false;
    }

    public void setAppetite(boolean satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate p) {
        if (p.getFood() >= getAppetite()) {
            p.decreaseFood(appetite);
            satiety = true;
            System.out.println("Cat " + getName() + " ate " + getAppetite());
        } else {
            satiety = false;
            System.out.println(getName() + " didn't eat because it doesn't have enough food");
        }
    }

    public void info() {
        if (isSatiety() != satiety) {
            System.out.println(getName() + " " + satiety);
        } else {
            System.out.println(getName() + " " + satiety);
        }
    }
}

