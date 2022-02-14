package lesson4.task5;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (getFood() >= n) {
            food -= n;
        }
    }

    public void increaseFood(int n) {
            food += n;
        System.out.println("Added food to the plate: " + n);
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}