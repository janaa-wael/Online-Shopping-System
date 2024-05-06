/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/**
 *
 * @author Doaa Said
 */

public class Pants extends Denim {
  
  private double length;
  private double waist;
  private static  HashMap<Size,Integer> Quantityinstock=new HashMap<>() {{
         
      put(Size.XS, 70);
      put(Size.S, 80);
      put(Size.M, 40);         
      put(Size.L, 90);  
      put(Size.XL,50);
      put(Size.XXL,0);
      
     }};
 
    
public Pants(double price,int id ,String color,String brand,String style,double length,
 double waist){
  super(price,id,color,brand);
  this.setStyle(style);
  this.length=length;
  this.waist=waist;
   setSize();
  
  
 }
  public static void setQuantityinstock(Size size,Integer  Quantityinstock) {
        Pants.Quantityinstock .put(size, Quantityinstock);
    }
    
    public static Integer getQuantityInStock(Size size){
        
        return Quantityinstock.get(size);
        
    }
public static boolean availability(Size size){
    return (Quantityinstock.get(size)!=0);}
    
    private String isInStock(){
        if(Products.sumValues(Quantityinstock)==0)
            return "Out of stock";
        
             else  return  "In stock";
        
        
    }
    
  @Override
     public void setStyle(String Style) {
        super.setStyle(Style);
        super.setName(" Denim Pants");
         putDescription();
        
    }

    public double getLength() {
        return length;
    }

    public double getWaist() {
        return waist;
    }

  
    public void setLength(double length) {
        this.length = length;
    }

    public void setWaist(double waist) {
        this.waist = waist;
    }

  
 
  
    private void putDescription(){
      switch (super.getStyle()) {
          case "Skini jeans" -> super.setDescription("Trouser with a high degree of tightness and can be with different landings - both high and low. It is sewn from stretch material with the addition of elastane, which ensures a flawless fit");
          case "Mom jeans" -> super.setDescription("Trouser with astraight free cut with a high fit and an accent in the hip area. The leg below may be straight or narrowed, but it never hugs the lower leg");
          case "Straight jeans" -> super.setDescription("Trouser with  a perfectly straight cut. With the right size, they sit perfectly on any type of figure, do not emphasize the shortcomings");
          case "Cargo pants" -> super.setDescription("functional pant with a loose fit designed to allow for freedom of movement, especially at the knees and hips. Its fabric is traditionally sturdy cotton or cotton-wool blend that can withstand rigorous wear and harsh elements");
          case "Wide-leg jeans" -> super.setDescription("loose-fitting Trouser that has a wide and flowy silhouette, starting from the waist and extending down to the hem, offering a relaxed and comfortable fit");
          default -> {
          }
      }
    
    }
  private void setSize(){
      if(length<32&&waist<32)
          super.setSize(Size.XS);
      else if(length<32&&waist>32&&waist<34)
      super.setSize(Size.S);
      else if(length<34&&waist>34&&waist<38)
     super.setSize(Size.M);
       else if(length<34&&waist>38&&waist<42)
          super.setSize(Size.L);  
         else if(length<34&&waist>42&&waist<44)
          super.setSize(Size.XL);
      
  }  
    

    @Override
    public String toString() {
     List<Size>sizes=Arrays.asList(Size.values());
        return super.toString() +"if waist and length is smaller than 32: optimum size is "+sizes.get(0)+"\n"
               
                +"if waist is between 32 and 34 and length is less than 32: optimum size is"+sizes.get(1)+"\n"
                +"if waist is between 34 and 38 and length is less than 34: optimum size is"+sizes.get(2)+"\n"
                +"if width is between 38 and 42 and length is less than 34: optimum size is"+sizes.get(3)+"\n"
                +"if width is between 42 and 44 and length is less than 34: optimum size is"+sizes.get(4)+"\n"
                +"Availability:"+isInStock()+"\n";
       
       
    }
 @Override
 public void printStyles(){
System.out.println("""
                   Styles:
                   1-"Skini jeans
                   2-"Mom jeans
                   3-"Straight jeans
                   4-"Cargo pants
                   5-"Wide-leg jeans
                   """);

}

}
