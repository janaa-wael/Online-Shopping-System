/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Sarah Tarek
 */

import java.time.LocalDate;

public class Abaya extends HijabClothes {
    // constructors
    public Abaya() {
    }
    
    public Abaya(double price, int id,String color ,String style){
        super(price,id,color);
        this.setStyle(style);
    }
    
    public Abaya(double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color , String style){
        super(price,id,startOfferDate,endOfferDate,color);
        this.setStyle(style);
    }
    
    
    @Override
    public void setStyle(String style){
        super.setStyle(style);
        super.setName("Abaya");
        putDescription();
    }
    
    private void putDescription(){
       switch (super.getStyle()) {
          case "Open-front abaya":
              super.setDescription("Modern style that features an open design at the front.");
          case "Butterfly abaya":
              super.setDescription("Wide flowing sleeves that resembles the wings of a butterfly.");
          case "Flared abaya":
              super.setDescription("Abaya that widens gradually from the waist down.");
          case "Traditional abaya":
              super.setDescription("Stylish black abaya");
       }
    }
     
    
    @Override
    public void printStyles(){
        System.out.println("""
                           Styles:
                           1-Open-front abaya
                           2-Butterfly abaya
                           3-Flared abaya
                           4-Traditional abaya""");
    }
}
