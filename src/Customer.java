public class Customer {
        // Egenskaper
        private int numberOfItemsPurchased;
        private double totalCost;

        // Konstruktor
        public Customer() {
            numberOfItemsPurchased = 0;
            totalCost = 0.0;
        }
        // Metoder
        public int getNumberOfItemsPurchased() {
            return numberOfItemsPurchased;
        }

        public double getTotalCost() {
            return totalCost;
        }

        public void purchaseItem(double price) {
            numberOfItemsPurchased++;
            totalCost += price;
        }
}

