
public class Customer extends User{
    ArrayList<Products> cart = new ArrayList<Products>();
	
	public customers(String username,String password) {
		this.username=username;
		this.password=password;
	};
	
	
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
}
