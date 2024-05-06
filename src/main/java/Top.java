



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.util.HashMap;
import java.time.LocalDate;
public class Top extends Sportswear{
    
    //hashmap contains the sizes and the quantity of each size in stock
    private static HashMap<Size, Integer> quantityInStock = new HashMap<>() {
        {
            put(Size.XS, 100);
            put(Size.S, 100);
            put(Size.M, 100);
            put(Size.L, 100);
            put(Size.XL, 100);
            put(Size.XXL, 100);  
        }
    };
    //constructor to initialize the price, id, color, size and the style of the sport top
    public Top(double price, int id,String color ,String style,Size size ){
        super(price,id,color,size);
        this.setStyle(style);
    }
    //constructor to initialize the price, id, startOfferDate, endOfferDate,color, size and the style of the sport top
    public Top(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color ,String style,Size size ){
       super(price,id,startOfferDate,endOfferDate,color,size);
       this.setStyle(style);
    }

    //method to set the quantity in stock of a certain size
    public static void setOneQuantity(Size size, int quantityInStock) {
        Top.quantityInStock.put(size,quantityInStock);
    }

    //method to set the hashmap ( setting the quantity in stock for all sizes )
    public static void setQuantityInStock(HashMap<Size, Integer> quantityInStock) {
        Top.quantityInStock = quantityInStock;
    }

    //method returns the quantity in stock of a certain size
    public static Integer getOneQuantity(Size size) {
        return quantityInStock.get(size);
    }
    
    //private method sets the description of a sport top depending on its style 
    //it's called only in setStyle method to set the description once the style is set
    private String putDescription(){
        if(super.getStyle().equalsIgnoreCase("long sleeve"))
            return "Long Sleeve Crew Neck Sport T-Shirt For women";
        else if(super.getStyle().equalsIgnoreCase("short sleeve"))
            return "Standard Fit V-Neck Sportsman Short Sleeve T-Shirt For Women ";
        else if(super.getStyle().equalsIgnoreCase("sleeveless"))
            return "Regular Fit Crew Neck Sleeveless T-Shirt For Women";
        else 
            return "Sports Crop Top";
    }
    
    
    //method prints the available styles of sport tops in the store
    @Override
    public void printStyles(){
        System.out.println("Styles:"                                            
                            +"\n"+"1-long sleeve"                                
                            +"\n"+"2-short sleeve"
                            +"\n"+"3-sleeveless"
                            +"\n"+"4-crop");
    }
    
    //method to set the style of the sport top (and setting the name and descripton after that ) 
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName("Sport Top");
        super.setDescription( this.putDescription());
    }
    
    //method determines if a certain size is available
    public static boolean availability(Size size){
        return (quantityInStock.get(size) !=0);
    }
    //private method determines if there are tops in stock 
    //it's only used in toString method to return "in stock" and "out of stock" strings
    private String isInStock(){
        if(Products.sumValues(quantityInStock) !=0)
            return "in stock";
        else
             return "out of stock";
    }
    
    //method return a string descripes the sport top
    @Override
    public String toString(){
        return super.toString()
                +"\n"+"Availability: "+ this.isInStock();
    }
    
}
