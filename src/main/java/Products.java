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
    private String description;
    
    public Products(){
    }
    
    public Products(String name ,double price,int id ,String description){
        this.name = name;
        this.price = price;
        this.id=id;
        this.description=description;
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
    
      // offer interface implementation
    @Override
    public void displayDescription(){
        System.out.println(this.getOfferPercentage() *100 +"% discount on "+ name);
    }
    @Override
    public double  getPriceAfterDiscount(){
        return ( price - price * this.getOfferPercentage() );
    }
    
    @Override
    public boolean isOfferAvailable(){
        return this.getOfferPercentage() != 0;
    }
  
    @Override
    public abstract double getOfferPercentage();

    @Override
    public LocalDate getStartDate(){
        LocalDate currentDate = LocalDate.now();
        return currentDate; 
    }
    
    @Override
    public LocalDate getEndDate(){
        LocalDate dateAfterTwoWeeks = this.getStartDate().plusWeeks(2);
        return dateAfterTwoWeeks;  
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
        return "Name: "+name+"\n"+"ID: "+id+"\n"+"Price: "+price+"\n"+"Description: "+description;
    } 
    
}
