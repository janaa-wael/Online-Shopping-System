



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.time.LocalDate;
import java.util.HashMap;
public class SportPants extends Sportswear{
    
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
    //constructor to initialize the price, id, color, size and the style of the sport pants
    public SportPants(double price, int id,String color ,String style,Size size ){
        super(price,id,color,size);
        this.setStyle(style);
    }
    //constructor to initialize the price, id, startOfferDate, endOfferDate,color, size and the style of the sport pants
    public SportPants(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style,Size size){
        super(price,id,startOfferDate,endOfferDate,color,size);
        this.setStyle(style);
    }
    
    //method to set the quantity in stock of a certain size
    public static void setOneQuantity(Size size, int quantityInStock) {
        SportPants.quantityInStock.put(size,quantityInStock);
    }
    
    //method to set the hashmap ( setting the quantity in stock for all sizes )
    public static void setQuantityInStock(HashMap<Size, Integer> quantityInStock) {
        SportPants.quantityInStock = quantityInStock;
    }
    
    //method returns the quantity in stock of a certain size
    public static Integer getOneQuantity(Size size) {
        return quantityInStock.get(size);
    }
    
    //private method sets the description of a sport pants depending on its style 
    //it's called only in setStyle method to set the description once the style is set
    private String putDescription(){
        if(super.getStyle().equalsIgnoreCase("wide leg"))
            return "Sport Wide Leg With Line – High Waist - Side Pockets Drawstring Pants Women Sports wear";
        else if(super.getStyle().equalsIgnoreCase("straight leg"))
            return "Women Mid-Rise Straight Leg Lounge Pants";
        else if(super.getStyle().equalsIgnoreCase("Leggings"))
            return "High Waisted Leggings for Women - Soft Opaque Slim Tummy Control Printed Pants for Running Cycling Yoga";
        else
            return "Sport Sweatpants with line – High Waist - Side Pockets Drawstring Pants Women Sports wear";
    }
    
    //private method sets the name of a sport pants depending on its style 
    //it's called only in setStyle method to set the name once the style is set
    private String putName(){
        if(super.getStyle().equalsIgnoreCase("Leggings"))
            return "Leggings Pants";
        else
            return "Sport Sweatpants";
    }
    
    //method prints the available styles of sport pants in the store
    @Override
    public void printStyles(){
        System.out.println("Styles:"
                            +"\n"+"1-wide leg"
                            +"\n"+"2-straight leg"
                            +"\n"+"3-leggings"
                            +"\n"+"4-sweatpants");
    }
    
    //method to set the style of the sport pants (and setting the name and descripton after that ) 
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName(this.putName());
        super.setDescription( this.putDescription());
    }
    //method determines if a certain size is available
    public static boolean availability(Size size){
        return (quantityInStock.get(size) !=0);
    }
    //private method determines if there are pants in stock 
    //it's only used in toString method to return "in stock" and "out of stock" strings
    private String isInStock(){
        if(Products.sumValues(quantityInStock) !=0)
            return "in stock";
        else
             return "out of stock";
    }
    
    //method return a string descripes the sport pants
    @Override
    public String toString(){
        return super.toString()
                +"\n"+"Availability: "+ this.isInStock();
    }
    
}
