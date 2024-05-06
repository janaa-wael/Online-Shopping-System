/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.time.LocalDate;
import java.util.HashMap;
public abstract class Products implements Offer , Comparable<Products>{
    private String name;
    private double price;
    private String style;
    private int id;
    private String description;
    private LocalDate startOfferDate;
    private LocalDate endOfferDate;
    
    public enum Size {XS,S,M,L,XL,XXL};
    
    public Products(){
    }
    
    //constructor initializes the price and id of the product
    public Products(double price,int id){
        this.price = price;
        this.id=id;
    }
     //constructor initializes the price, id, startOfferDate and endOfferDate of the product
    public Products(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate){
        this(price,id);
        this.startOfferDate = startOfferDate;
        this.endOfferDate = endOfferDate;
    }

    // setters
    //method to set the name of the product
    public void setName(String name) {
        this.name = name;
    }
    
    //method to set the price of the product
    public void setPrice(double price) {
        this.price = price;
    }
    
    //method to set the id of the product
    public void setId(int id) {
        this.id = id;
    }
    
    //method to set the description of the product
    public void setDescription(String description) {
        this.description = description;
    }
    
    //method to set the start and end date of the offer on the product
    public void setOfferDate(LocalDate startOfferDate,LocalDate endOfferDate){
        this.startOfferDate=startOfferDate;
        this.endOfferDate=endOfferDate;
    }
    
    //method to set the style of the product
    public void setStyle(String style) {
        this.style = style;
    }
    
    //getters
    //method to get the name of the product
    public String getName() {
        return name;
    }
    
    //method to get the price of the product
    public double getPrice() {
        return price;
    }
    
    //method to get the id of the product
    public int getId() {
        return id;
    }
    
    //method to get the description of the product
    public String getDescription() {
        return description;
    }
    
    //method to get the style of the product
    public String getStyle() {
        return style;
    }
    
    //abstract method to print the style of the product
    public abstract void printStyles();
    
      // offer interface implementation
    //method prints description of the offer
    @Override
    public void displayOfferDescription(){
        //first check if there is an offer or not
        if(this.isOfferAvailable() == false)
            System.out.println("There is no offer on this product");
        else 
            System.out.println(this.getOfferPercentage() *100 +"% discount on "+ name);
    }
    
    //method returns the price after the discount 
    @Override
    public double  getPriceAfterDiscount(){
        //first check if there is an offer or not
        if(this.isOfferAvailable() == false) return price;
        else return ( price - price * this.getOfferPercentage());
    }
    
    //method checks whether the offer is available for the product or not
    @Override
    public boolean isOfferAvailable(){
        LocalDate now = LocalDate.now();
        if(startOfferDate==null)  return false;    //if the start day of the offer isn't set, there is no offer 
        //if the date now is before the start day of the offer or after the end date of the offer, the offer is unavailable now
        else if(now.compareTo(startOfferDate) < 0  || now.compareTo(endOfferDate) > 0) return false;
        //if getOfferPercentage returns 0, there is no offer on this product
        else return this.getOfferPercentage() != 0;
    }
    
    //method returns the start date of the offer
    @Override
    public LocalDate getStartDate(){
        return startOfferDate;    
    }
     //method returns the end date of the offer
    @Override
    public LocalDate getEndDate(){
      return endOfferDate;
    }
    
    
    // comparable interface implementation
    //metthod to compare between two products
    @Override
    public int compareTo(Products p){
        if(this==p) return 0;
        if(price == p.price) return 0;
        else if(price> p.price) return 1;
        else return -1;
    }
    
    //method return a string descripes the product
    @Override
    public String toString(){
        return "Name: "+name+"\n"+"ID: "+id+"\n"+"Price: "+price+"\n"+"Style: "+style+"\n"+"Description: "+description;
    } 
    
    
    //method returns the sum of the elements of an hashmap
    //we used it to calculate the total quantity in stock of all sizes of a product
    public static int sumValues(HashMap<Size, Integer> map) {
        int sum = 0;
        for (int value : map.values()) {
            sum += value;
        }
        return sum;
    }
    
}
