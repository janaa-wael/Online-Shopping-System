package com.mycompany.shoppingcenter;
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
 
 
    
public Pants(double price,int id ,String color,String brand,String style,double length,
 double waist){
  super(price,id,color,brand);
  this.setStyle(style);
  this.length=length;
  this.waist=waist;
    setcustomerSize();
  
  
 }
  

    

  @Override
     public void setStyle(String Style) throws StyleException {
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
  private void setcustomerSize(){
      if(length<32&&waist<32)
          super.setcustomerSize(Size.XS);
      else if(length<32&&waist>32&&waist<34)
      super.setcustomerSize(Size.S);
      else if(length<34&&waist>34&&waist<38)
     super.setcustomerSize(Size.M);
       else if(length<34&&waist>38&&waist<42)
          super.setcustomerSize(Size.L);  
         else if(length<34&&waist>42&&waist<44)
          super.setcustomerSize(Size.XL);
      
  }  
    

    @Override
    public String toString() {
     List<Size>sizes=Arrays.asList(Size.values());
        return super.toString() +"if waist and length is smaller than 32: optimum size is "+sizes.get(0)+"\n"
               
                +"if waist is between 32 and 34 and length is less than 32: optimum size is"+sizes.get(1)+"\n"
                +"if waist is between 34 and 38 and length is less than 34: optimum size is"+sizes.get(2)+"\n"
                +"if width is between 38 and 42 and length is less than 34: optimum size is"+sizes.get(3)+"\n"
                +"if width is between 42 and 44 and length is less than 34: optimum size is"+sizes.get(4)+"\n"
              ;
       
       
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
