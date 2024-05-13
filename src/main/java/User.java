import java.util.ArrayList; 
public abstract class User {
        protected String username;
	protected String password;
	protected ArrayList<String> customers = new ArrayList<String>();
	protected ArrayList<Products> products = new ArrayList<String>();
    public boolean isProductAvailable(String productID) {
		if (products.contains(productID)) return true;
		else return false;
	}
	//public abstract boolean authenticate(String email,String password);

}
