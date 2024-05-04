
package com.mycompany.shoppingcenter;
import java.time.LocalDate;  
import java.util.ArrayList;
/**
 *
 * @author Dell
 */
public class Order {
 private String ID;
 private Customer customer;
private LocalDate shipping_date;
private ArrayList<Products>productslist=new ArrayList<Products>();
private double total_cost=0;
String payment;
private boolean isShipped;

    public Order(String ID,Customer customer, ArrayList<Products>productslist) {
        this.ID=ID;
        this.customer = customer;
       
        this.productslist=productslist;
        
calculate_cost() ;  }

    public String getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDate getShipping_date() {
         LocalDate currentDate = LocalDate.now();
          shipping_date = currentDate.plusWeeks(1);
        return shipping_date;
    }

    public double getTotal_cost() {
       
        return total_cost;
    }
    
    

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

  private void calculate_cost(){
      for(int i=0;i<productslist.size();i++){
          total_cost+=productslist.get(i).getPrice();
      
      }
}
      
  
    public ArrayList<Products> getProductslist() {
        return productslist;
    }

    public String getPayment() {
        return payment;
    }

    public boolean isIsShipped() {
        
        return isShipped;
    }

    @Override
    public String toString() {
        return customer.toString() + "ID=" + ID + ", shipping_date=" + shipping_date + ", productslist=" + productslist + ", total_cost=" + total_cost + ", payment=" + payment + ", isShipped=" + isShipped + '}';
    }

   

   

  

    
  
    
    
    
    
}
