package src;

public class CandyMac {
    private static final int TOTAL_COMPARTMENTS = 10;
    private Compartment[] compartments;

    public CandyMac() {
        compartments = new Compartment[TOTAL_COMPARTMENTS];
        for (int i = 0; i < TOTAL_COMPARTMENTS; i++) {
            compartments[i] = new Compartment(10); // Each compartment can hold 10 items
        }
    }

    public void addProduct(int index, Product product, int quantity) {
        if (index >= 0 && index < compartments.length) {
            compartments[index].fill(product, quantity);
        }
    }

    public void takeItem(int index) {
        if (index >= 0 && index < compartments.length) {
            boolean success = compartments[index].takeItem();
            if (!success) {
                System.out.println("Out of stock: " + compartments[index]);
            }
        }
    }

    public void printReport() {
        System.out.println("\nMachine Stock Report:");
        for (int i = 0; i < compartments.length; i++) {
            System.out.println("Slot " + i + ": " + compartments[i]);
        }
    }

    public static void main(String[] args) {
        CandyMac machine = new CandyMac();

        // Add drinks
        machine.addProduct(0, new SodaCan("Coca Cola", 2.00, 300, 20, false), 5);
        machine.addProduct(1, new SodaCan("RedBull", 2.50, 300, 100, true), 5);

        // Add snacks
        machine.addProduct(2, new Candy("M&M's", 1.50, 230), 10);
        machine.addProduct(3, new Candy("Mars", 1.00, 230), 10);
        machine.addProduct(4, new Candy("Twix", 1.20, 230), 10);
        machine.addProduct(5, new Candy("Lion", 1.25, 230), 10);
        machine.addProduct(6, new Candy("Snickers", 1.50, 230), 10);

        // Take some items
        for (int i = 0; i < 3; i++) {
            machine.takeItem(0);
            machine.takeItem(1);
        }

        machine.printReport();
    }
}
