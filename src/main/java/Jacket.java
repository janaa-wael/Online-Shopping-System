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
public class Jacket extends Denim{
   
    private double width;
    
  
     private static  HashMap<Size,Integer> Quantityinstock=new HashMap<>() {{
         
      put(Size.XS, 50);
      put(Size.S, 50);
      put(Size.M, 50);         
      put(Size.L, 50);  
      put(Size.XL,50);
      
      put(Size.XL,50);
      
     }};

    public Jacket( double price, int id, String color, String brand,String style,double width) {
        super(price, id, color, brand);
       this. setStyle( style);
        this.width = width;
        setSize();
        
    }
     @Override
     public void setStyle(String Style) {
        super.setStyle(Style);
        super.setName(" Denim Jacket");
        putDescription();
        
    }
     
     

    public static void setQuantityinstock(Size size,Integer  Quantityinstock) {
        Jacket.Quantityinstock .put(size, Quantityinstock);
    }
    
    public static Integer getQuantityInStock(Size size){
        
        return Quantityinstock.get(size);
        
    }
    
   
    private void putDescription(){
       switch (super.getStyle()) {
          case "cropped jacket" -> super.setDescription("Jacket that has the shorter length visually raises your waist and elongates your legs");
          case "Regular jacket"  -> super.setDescription("Jacket that hits at hip length, which is ideal for pairing with jeans or pants since it won't cut you off at the waist");
    default -> {
          }
    
    
}}
    private void setSize(){
      if(width<32)
          super.setSize(Size.XS);
      else if(width>32&&width<34)
      super.setSize(Size.S);
      else if(width>34&&width<38)
     super.setSize(Size.M);
       else if(width>38&&width<42)
          super.setSize(Size.XL); 
        else if(width>42&&width<46)
          super.setSize(Size.XXL); 
      
     
  }    

   

    public double getWidth() {
        return width;
    }
public static boolean availability(Size size){
    return (Quantityinstock.get(size)!=0);}
    
    private String isInStock(){
        if(Products.sumValues(Quantityinstock)==0)
            return "Out of stock";
        
             else  return  "In stock";
        
        
    }
   
      
    @Override
     public String toString() {
         List<Size>sizes=Arrays.asList(Size.values());
        return super.toString() +"if width is smaller than 32 optimum size is "+sizes.get(0)+"\n"
               
                +"if width is between 32 and 34  optimum size is"+sizes.get(1)+"\n"
                +"if width is between 34 and 38  optimum size is"+sizes.get(2)+"\n"
                +"if width is between 38 and 42  optimum size is"+sizes.get(3)+"\n"
                +"if width is between 38 and 42  optimum size is"+sizes.get(4)+"\n"
                +"if width is between 42 than 46  optimum size is"+sizes.get(5)+"\n"
                +"Availability:"+isInStock()+"\n";
    }    
        
   
    @Override
 public void printStyles(){
System.out.println("""
                   Styles:
                   1-"cropped jacket
                   2-"Regular jacket
                   """);




}
}
