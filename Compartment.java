public class Compartment {
    private Product product;
    private int stock;
    private final int capacity;


    public Compartment (int capacity){
        this.capacity=capacity;
        product=null;
        stock=0;
    }

    public void fill(Product product){
        this.product=product;
        stock=capacity;
    }

    @Override
    public String toString() {

        return super.toString();
    }
}
