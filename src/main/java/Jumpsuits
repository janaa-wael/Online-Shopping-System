/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarah Tarek
 */

import java.time.LocalDate;

public class Jumpsuits extends HijabClothes {
    // constructors
    public Jumpsuits() {
    }
    
    public Jumpsuits(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    
    public Jumpsuits(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style){
        super(price,id,startOfferDate,endOfferDate,color);
        this.setStyle(style);
    }
    
    
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName("Jumpsuit");
        putDescription();
    }
    
       
    private void putDescription(){
       switch (super.getStyle()) {
          case "Wide-leg jumpsuit":
              super.setDescription("Comfortable jumpsuit with trousers that flare from the waist down.");
          case "Palazzo jumpsuit":
              super.setDescription("Chic jumpsuit with beautiful flowing legs.");
          case "Sleeveles jumpsuit":
              super.setDescription("Elegant jumpsuit for warm weather or layering with cardigans.");
          case "Long-sleeve jumpsuit":
              super.setDescription("Stylish jumpsuit that covers the whole arm.");    
       }
    }
        
    @Override
    public void printStyles(){
        System.out.println("""
                           Styles:
                           1-Wide-leg jumpsuit
                           2-Palazzo jumpsuit
                           3-Sleeveles jumpsuit
                           4-Long-sleeve jumpsuit""");
    }
}
