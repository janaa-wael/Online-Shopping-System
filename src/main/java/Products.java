/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
import java.time.LocalDate;
public abstract class Products implements Offer , Comparable<Products>{
    private String name;
    private double price;
    private int id;
    private String style;
    private String description;
    private LocalDate startOfferDate;
    private LocalDate endOfferDate;
    
    public Products(){
    }
    public Products(double price,int id){
        this.price = price;
        this.id=id;
    }
    public Products(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate){
        this(price,id);
        this.startOfferDate = startOfferDate;
        this.endOfferDate = endOfferDate;
    }


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void setStyle(String style){
        this.style=style;
    }

    public void setOfferDate(LocalDate startOfferDate,LocalDate endOfferDate){
        this.startOfferDate=startOfferDate;
        this.endOfferDate=endOfferDate;
    }

    //getters
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    
    public String getDescription() {
        return description;
    }
    public String getStyle(){
        return style;
    }
    
      // offer interface implementation
    @Override
    public void displayOfferDescription(){
        if(this.isOfferAvailable() == false)
            System.out.println("There is no offer on this product");
        else 
            System.out.println(this.getOfferPercentage() *100 +"% discount on "+ name);
    }
    @Override
    public double  getPriceAfterDiscount(){
        if(this.isOfferAvailable() == false) return price;
        else return ( price - price * this.getOfferPercentage());
    }
    
    @Override
    public boolean isOfferAvailable(){
        LocalDate now = LocalDate.now();
        if(startOfferDate==null)  return false;
        else if(now.compareTo(startOfferDate) < 0  || now.compareTo(endOfferDate) > 0) return false;
        else return this.getOfferPercentage() != 0;
    }

    @Override
    public LocalDate getStartDate(){
        return startOfferDate;    
    }
    
    @Override
    public LocalDate getEndDate(){
      return endOfferDate;
    }
    
    
    // comparable interface implementation
    @Override
    public int compareTo(Products p){
        if(this==p) return 0;
        if(price == p.price) return 0;
        else if(price> p.price) return 1;
        else return -1;
    }
    
    
    @Override
   public String toString(){
        return "Name: "+name+"\n"+"ID: "+id+"\n"+"Price: "+price+"\n"+"Style: "+style+"\n"+"Description: "+description;
    } 
}
