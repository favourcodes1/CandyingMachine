package src;

public class SodaCan extends Product {
    private int milliliters;
    private int sugarGrams;
    private boolean hasCaffeine;

    public SodaCan(String name, double price, int milliliters, int sugarGrams, boolean hasCaffeine) {
        super(name, price);
        this.milliliters = milliliters;
        this.sugarGrams = sugarGrams;
        this.hasCaffeine = hasCaffeine;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + milliliters + "ml, " + sugarGrams + "g sugar, " + (hasCaffeine ? "Caffeinated" : "Non-Caffeinated") + ")";
    }
}
