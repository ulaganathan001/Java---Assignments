package ShopingCart;

import java.util.InputMismatchException;

import java.util.Scanner;
public class ShoppingcartApp {
	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		Scanner scanner = new Scanner(System.in);
		sc.addProduct(new Product("Pen", 70));
		sc.addProduct(new Product("Pencil", 10));
		sc.addProduct(new Product("Eraser", 10));
		sc.addProduct(new Product("Scale", 10));
		int choice = 0;
		do {
			try {
				System.out.println("\n1. List of Products");
				System.out.println("2. Add Product to Cart");
				System.out.println("3. Update Product in Cart");
				System.out.println("4. Remove Product from Cart");
				System.out.println("5. Display Bill and Exit");
				System.out.print("\nEnter your choice: ");
				choice = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine();
			}
			switch (choice) {
			case 1:
				sc.listProducts();
				break;
			case 2:
				String s = null;
			    do {
			        try {
			            System.out.print("Enter product name to add to cart: ");
			            String productName = scanner.next();
			            System.out.print("Enter quantity: ");
			            int quantity = scanner.nextInt();

			            sc.addProductToCart(productName, quantity);
			            
			            System.out.print("Do you want to add one more product to the cart? (yes/no): ");
			            s=scanner.next();
			        } catch (Exception e) {
			            System.out.println("Invalid input. Please enter a valid number.");
			            scanner.nextLine(); // Clear the input buffer
			        }
			    } while (s.equalsIgnoreCase("yes"));

			    break;
			case 3:
				System.out.println("\nEnter product name to update in cart:");
				String productNameUpdate = scanner.next();
				try {
					System.out.println("Enter new quantity:");
					int newQuantity = scanner.nextInt();
					sc.updateProductInCart(productNameUpdate, newQuantity, scanner);
				} catch (InputMismatchException e) {
					System.out.println("Invalid input. Quantity should be a number.");
					scanner.nextLine(); // Consume the invalid input
				}
				break;
			case 4:
				System.out.println("\nEnter product name to remove from cart:");
				String productNameRemove = scanner.next();
				sc.removeProductFromCart(productNameRemove);
				break;
			case 5:
				sc.displayCart();
				int totalPrice = sc.calculateTotalPrice();
				System.out.println("Total Price: " + totalPrice);
				break;
			default:
				System.out.println("Invalid choice. Please enter a number between 1 and 5.");
			}
		} while (choice != 5);
	}

}
