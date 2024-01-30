package ShopingCart;

public class Product {

	String name;
	int price;

	Product(String name,int price){
		this.name=name;
		this.price=price;
	}

}
	class CartItem {
	    Product product;
	    int quantity;

	    public CartItem(Product product, int quantity) {
	        this.product = product;
	        this.quantity = quantity;

	    }
	    public int getTotalPrice() {
	        return product.price * quantity;
	    }

	}

