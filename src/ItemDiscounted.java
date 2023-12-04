public class ItemDiscounted extends Product{
    // Egenskaper
    private double discount;

    // Konstruktor
    public ItemDiscounted(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;
    }
    // Metoder
    public double getDiscount() {
        return discount;
    }
    public double getPrice() {
        return super.getPrice() * (1 - discount);
    }
}
