
public class Customer extends User{
    	
	ArrayList<Products> cart = new ArrayList<Products>();
	ArrayList<Order> myOrders = new ArrayList<Order>();
	boolean OrderConfirmed;
	int numberOfOrders;
	public Customer(){
		username="";
		password="";
	}
	public Customer(String username,String password) {
		this.username=username;
		this.password=password;
	};
	

	public int getNumberOfOrders() {
		return numberOfOrders;
	}

	public void setOrderConfirmed(boolean orderConfirmed) {
		OrderConfirmed = orderConfirmed;
	}

	public void addToCart(Products product , int quantity) {
		while(quantity>0) {
		cart.add(product);
		quantity--;
		}
	}
	
	public void removeFromCart(Products product,int quantity) {
		while(quantity>0) {
			cart.remove(product);
			quantity--;
			}
	}
	
	public ArrayList<Products> getCart() {
		return cart;
	}
	
	public void addOrder(Order order) {
		
		if(OrderConfirmed) {
			myOrders.add(order);
			cart.clear();
			this.numberOfOrders++;
		}
		else System.out.println("Please confirm your order");
		
	}
	
	
	
	
	
}
