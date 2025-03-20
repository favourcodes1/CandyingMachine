package src;

public class Candy extends Product {
    private int calories;

    public Candy(String name, double price, int calories) {
        super(name, price);
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + calories + " kcal)";
    }
}
