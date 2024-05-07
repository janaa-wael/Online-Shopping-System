
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aziza
 */
import java.time.LocalDate;
public final class Top extends Sportswear{
    
    //constructor to initialize the price, id, color, size and the style of the sport top
    public Top(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    //constructor to initialize the price, id, startOfferDate, endOfferDate,color, size and the style of the sport top
    public Top(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color ,String style){
       super(price,id,startOfferDate,endOfferDate,color);
       this.setStyle(style);
    }
    
     //method to set the style of the sport top (and setting the name and descripton after that ) 
    @Override
    public final void setStyle(String style){
        super.setStyle(style);
        super.setName("Sport Top");
        super.setDescription( this.putDescription());
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
        System.out.println("""
                           Styles:
                           1-long sleeve
                           2-short sleeve
                           3-sleeveless
                           4-crop""");
    }
    
}
