import java.util.ArrayList;

public class Customer extends User {
    ArrayList<Products> cart = new ArrayList<Products>();
    ArrayList<Order> myOrders = new ArrayList<Order>();
    boolean OrderConfirmed;
    int numberOfOrders;

    public Customer() {
        username = "";
        password = "";
    }
//in case a new customer was created by admin
    public Customer(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public int getNumberOfOrders() {
        return numberOfOrders;
    }
//to add order and clear cart
    public void setOrderConfirmed(boolean orderConfirmed) {
        OrderConfirmed = orderConfirmed;
    }

    public void addToCart(Products product, int quantity, Products.Size size) {
        try {
            int availableQuantity = product.getOneQuantity(size);
            if (quantity > availableQuantity) {
                System.out.println("Not enough stock. Quantity available = " + availableQuantity);
            } else {
                product.setOneQuantity(size, availableQuantity - quantity);
                for (int i = 0; i < quantity; i++) {
                    cart.add(product);
                }
            }
        } catch (Exception ex) {
            System.err.println("Failed to add product to cart: " + ex.getMessage());
        }
    }

    public void removeFromCart(Products product, int quantity, Products.Size size) {
        try {
            if (!cart.contains(product)) {
                throw new IllegalArgumentException("Product not found in cart.");
            }
            int toRemove = Math.min(quantity, cart.size());
            for (int i = 0; i < toRemove; i++) {
                cart.remove(product);
            }
            product.setOneQuantity(size, product.getOneQuantity(size) + toRemove);
        } catch (Exception ex) {
            System.err.println("Failed to remove product from cart: " + ex.getMessage());
        }
    }

    public ArrayList<Products> getCart() {
        return cart;
    }

    public void addOrder(Order order) {
        try {
        
            myOrders.add(order);
            cart.clear();
            numberOfOrders++;
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        } catch (Exception ex) {
            System.err.println("An error occurred while adding the order: " + ex.getMessage());
        }
    }
}
