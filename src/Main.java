// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Product product1 = new Product("Mask", 235.50, 14);
        ItemDiscounted product2 = new ItemDiscounted("Plastic knife", 45.50, 3, 0.1);// 10% discount
        Product product3 = new Product("Fake blood", 89.10, 44);
        Product[] products = {product1, product2, product3};
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display the menu
            System.out.println("Menu:");
            for (int i = 0; i < products.length; i++) {
                System.out.println((i + 1) + ". " + products[i].getName() + ", " + products[i].getPrice() + " SEK, " + products[i].getQuantity()+" left.");
            }
            System.out.println("4. Quit");

            // Read user's choice
            System.out.print("Choose your option (4 to exit): ");
            int choice = scanner.nextInt();
            if (choice == 4) {
                // Exit the program if the user chooses 4
                break;
            } else if (choice>0 && choice <= products.length) {
                // User's choice is valid
                int selectedIndex = choice - 1;

                Product selected = products[selectedIndex];
                double price = selected.getPrice();
                if (selected.getQuantity() > 0) {
                    selected.updateQuantity();
                    customer.purchaseItem(price);

                } else {
                    System.out.println("Sorry, " + selected.getName() + " is out of stock.");
                }
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        System.out.println();
        System.out.println("You purchased a total of " + customer.getNumberOfItemsPurchased()+" items. "+"The total cost was: "+customer.getTotalCost()+" SEK.");


        scanner.close();
    }
}

