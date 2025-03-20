package src;

public class Compartment {
    private Product product;
    private int stock;
    private final int capacity;

    public Compartment(int capacity) {
        this.capacity = capacity;
        this.product = null;
        this.stock = 0;
    }

    public void fill(Product product, int quantity) {
        this.product = product;
        this.stock = Math.min(quantity, capacity);
    }

    public boolean takeItem() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return product == null ? "Empty" : product.toString() + " (Stock: " + stock + ")";
    }
}
