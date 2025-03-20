public class CandyMac {
    public static void main(String[] args) {
        public static void main(String[] args) {
            CandyMac machine = new CandyMac();

            // Add drinks
            machine.addProduct(0, new SodaCan("Coca Cola", 2.00, 300, 20, false));
            machine.addProduct(1, new SodaCan("RedBull", 2.50, 300, 100, true));

            // Add snacks
            machine.addProduct(2, new Candy("M&M's", 1.50, 230));
            machine.addProduct(3, new Candy("Mars", 1.00, 230));
            machine.addProduct(4, new Candy("Twix", 1.20, 230));
            machine.addProduct(5, new Candy("Lion", 1.25, 230));
            machine.addProduct(6, new Candy("Snickers", 1.50, 230));

            for (int i = 0; i < 3; i++) {
                machine.takeItem(0);
                machine.takeItem(1);
            }

            machine.printReport();
        }

    }

    private void printReport() {
    }

    private void takeItem(int i) {
    }

    private void addProduct(int i, SodaCan name) {
    }
}