import java.util.ArrayList; 
public abstract class User {
    String username;
	//String email;
	String password;
	ArrayList<String> customers = new ArrayList<String>();
	ArrayList<String> products = new ArrayList<String>();
    public boolean isProductAvailable(String productID) {
		if (products.contains(productID)) return true;
		else return false;
	}
	//public abstract boolean authenticate(String email,String password);

}
