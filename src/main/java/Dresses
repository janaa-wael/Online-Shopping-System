/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarah Tarek
 */

import java.time.LocalDate;

public class Dresses extends HijabClothes {
    
    // constructors
    public Dresses() {
    }
    
    public Dresses(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    
    public Dresses(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style){
        super(price,id,startOfferDate,endOfferDate,color);
        this.setStyle(style);
    }
    
    
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName("Dress");
        this.putDescription();
    }
    
    private void putDescription(){
       switch (super.getStyle()) {
          case "Casual dress":
              super.setDescription("Chic dress that combines comfort with style.");
          case "Gowns":
              super.setDescription("Elegant dress for special events and memorable occasions.");
       }
    }
     
    
    @Override
    public void printStyles(){
        System.out.println("""
                           Styles:
                           1-Casual dress
                           2-Gowns""");
    }
}
