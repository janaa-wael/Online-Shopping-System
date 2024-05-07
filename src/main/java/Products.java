
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aziza
 */
import java.time.LocalDate;
import java.util.HashMap;
public abstract class Products implements Offer , Comparable<Products>{
    private String name;
    private double price;
    private String style;
    private String color;
    private int id;
    private String description;
    private LocalDate startOfferDate;
    private LocalDate endOfferDate;
    
    //hashmap contains the sizes and the quantity of each size in stock
    private HashMap<Size, Integer> quantityInStock = new HashMap<>() {
        {
            put(Size.XS, 100);
            put(Size.S, 100);
            put(Size.M, 100);
            put(Size.L, 100);
            put(Size.XL, 100);
            put(Size.XXL, 100);  
        }
    };
    
    public enum Size {XS,S,M,L,XL,XXL};
    
    public Products(){
    }
    
    //constructor initializes the price and id of the product
    public Products(double price,int id, String color ){
        this.price = price;
        this.id=id;
        this.color=color;
    }
     //constructor initializes the price, id, startOfferDate and endOfferDate of the product
    public Products(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate,String color ){
        this(price,id,color);
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
    
    //method to set the color of the product
    public void setColor(String color) {
        this.color = color;
    }
    
    //method to set the quantity in stock of a certain size
    public void setOneQuantity(Size size, int quantityInStock) {
        this.quantityInStock.put(size,quantityInStock);
    }
    
    //method to set the hashmap ( setting the quantity in stock for all sizes )
    public void setQuantityInStock(HashMap<Size, Integer> quantityInStock) {
        this.quantityInStock = quantityInStock;
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
    
    //method to get the color of the product
    public String getColor() {
        return color;
    }
    
    //method returns the quantity in stock of a certain size
    public Integer getOneQuantity(Size size) {
        return quantityInStock.get(size);
    }
    
    //abstract method to print the style of the product
    public abstract void printStyles();
    
    //method determines if a certain size is available
    public boolean availability(Size size){
        return (quantityInStock.get(size) !=0);
    }
    
    //private method determines if the product is in stock 
    //it's only used in toString method to return "in stock" and "out of stock" strings
    private String isInStock(){
        if(Products.sumValues(quantityInStock) !=0)
            return "in stock";
        else
             return "out of stock";
    }
    
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
        return "Name: "+name+"\n"+"ID: "+id+"\n"+"Price: "+price+"\n"+"Style: "+style+"\n"
                +"Description: "+description+"\n"+"Availability: "+ this.isInStock()+ "\n"+"color: "+color;
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
