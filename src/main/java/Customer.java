

import java.util.ArrayList;

public class Customer extends User {
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

	public void addToCart(Products product , int quantity,Products.Size size) {
		if(quantity>product.getOneQuantity(size)) {System.out.println("Quantity available = "+product.getOneQuantity(size));}
		else{product.setOneQuantity(size,product.getOneQuantity(size)-quantity );
		while(quantity>0) {
		cart.add(product);
		quantity--;
		}
		
		}
	}
	
	public void removeFromCart(Products product,int quantity,Products.Size size) {
		try{product.setOneQuantity(size,product.getOneQuantity(size)+quantity );
		while(quantity>0) {
			cart.remove(product);
			quantity--;
			}
		
		}
		catch(Exception ex) {}
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
