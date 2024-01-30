package ShopingCart;
import java.util.*;

public class ShoppingCart {
	 ArrayList<Product> productList;
     ArrayList<CartItem> cart;
     
     Scanner scanner=new Scanner(System.in);
    public ShoppingCart() {
        this.productList = new ArrayList<>();
        this.cart = new ArrayList<>();
    }
    void addProduct(Product product) {
        productList.add(product);
    }
    void listProducts() {
        System.out.println(" \nList of Products :");
        for (Product product : productList) {
            System.out.println(product.name + " - " + product.price);
        }
    }
    void addProductToCart(String productName, int quantity) {
        Product selectedProduct = findProduct(productName);
        if (selectedProduct != null) {
            try {
                if (quantity > 0) {
                    CartItem cartItem = new CartItem(selectedProduct, quantity);
                    cart.add(cartItem);
                    System.out.println(quantity + " " + productName + " added to the cart.");
                }
                else {
                    System.out.println("Quantity should be greater than 0.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Quantity should be a number.");
                scanner.nextLine(); 
            }
        } else {
            System.out.println("Product not found in the list ");
        }
    }
    public void updateProductInCart(String productName, int newQuantity, Scanner scanner) {
        CartItem cartItemToUpdate = findCartItem(productName);
        if (cartItemToUpdate != null) {
            try {
                if (newQuantity > 0) {
                    cartItemToUpdate.quantity = newQuantity;
                    System.out.println(productName + " quantity updated to " + newQuantity + " in the cart.");
                } else {

                    System.out.println("Quantity should be greater than 0.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Quantity should be a number.");
                scanner.nextLine(); // Consume the invalid input
            }
        } else {
            System.out.println("Product not found in the cart.");
        }
    }
    public void removeProductFromCart(String productName) {
        CartItem cartItemToRemove = findCartItem(productName);
        if (cartItemToRemove != null) {
            cart.remove(cartItemToRemove);
            System.out.println(productName + " removed from the cart.");

        } else {
            System.out.println("Product not found in the cart.");
        }
    }
    public void displayCart() {
       
        System.out.println("Product\t\tQuantity\tTotal Price");
        for (CartItem cartItem : cart) {
            System.out.println(cartItem.product.name + "\t\t" + cartItem.quantity + "\t\t" + cartItem.getTotalPrice());
        }
       
    }
    private Product findProduct(String productName) {
        for (Product product : productList) {
            if (product.name.equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
    private CartItem findCartItem(String productName) {
        for (CartItem cartItem : cart) {
            if (cartItem.product.name.equalsIgnoreCase(productName)) {
                return cartItem;
            }
        }
        return null;
    }
    
    public int calculateTotalPrice() {
        int totalPrice = 0;

        for (CartItem product : cart) {
            totalPrice += product.getTotalPrice();
        }

        return totalPrice;
    }
}





