/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarah Tarek
 */

import java.time.LocalDate;

public class Skirts extends HijabClothes {
    
    // constructors
    public Skirts() {
    }
    
    public Skirts(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    
    public Skirts(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style){
        super(price,id,startOfferDate,endOfferDate,color);
        this.setStyle(style);
    }
    
    
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName("Skirt");
        putDescription();
    }
    
    
    private void putDescription(){
       switch (super.getStyle()) {
          case "Long skirt":
              super.setDescription("Flowing skirt that extends below the ankle.");
          case "Pencil skirt":
              super.setDescription("Professional skirt for formal work environments.");
          case "Tiered skirt":
              super.setDescription("Skirt with layers of fabric cascade down.");  
       }
    }
     
    
    @Override
    public void printStyles(){
        System.out.println("""
                           Styles:
                           1-Long skirt
                           2-Pencil skirt
                           3-Tiered skirt""");
    }
}
