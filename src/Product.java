public class Product {
    // Egenskaper
    private String name;
    private double price;
    private int quantity;

    // Konstruktor
    public Product(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    // Metoder
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public void updateQuantity(){
        if (quantity>0){
            quantity--;
        }
    }
}
