
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aziza
 */
import java.time.LocalDate;
public final class SportPants extends Sportswear{
    
    //constructor to initialize the price, id, color, size and the style of the sport pants
    public SportPants(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    //constructor to initialize the price, id, startOfferDate, endOfferDate,color, size and the style of the sport pants
    public SportPants(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style){
        super(price,id,startOfferDate,endOfferDate,color);
        this.setStyle(style);
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
        System.out.println("""
                           Styles:
                           1-wide leg
                           2-straight leg
                           3-leggings
                           4-sweatpants""");
    }
    
    //method to set the style of the sport pants (and setting the name and descripton after that ) 
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName(this.putName());
        super.setDescription( this.putDescription());
    }
    
    
}
