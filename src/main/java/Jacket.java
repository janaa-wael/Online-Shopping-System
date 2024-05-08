/**
 *
 * @author Doaa Said
 */
public class Jacket extends Denim{
   
    private double width;
    
  

    public Jacket( double price, int id, String color, String brand,String style,double width) {
        super(price, id, color, brand);
       this.setStyle( style);
        this.width = width;
        setcustomerSize();
        
    }
     @Override
     public void setStyle(String Style) {
        super.setStyle(Style);
        super.setName(" Denim Jacket");
        putDescription();
        
    }
     
     
    public void setWidth(double width) {
        this.width = width;
    }
   
     public double getWidth() {
        return width;
    }
    
    
    private void putDescription(){
       switch (super.getStyle()) {
          case "cropped jacket" -> super.setDescription("Jacket that has the shorter length visually raises your waist and elongates your legs");
          case "Regular jacket"  -> super.setDescription("Jacket that hits at hip length, which is ideal for pairing with jeans or pants since it won't cut you off at the waist");
    default -> {
          }
    
    
}}
    
    
    private void setcustomerSize(){
      if(width<32)
          super.setcustomerSize(Size.XS);
      else if(width>32&&width<34)
      super.setcustomerSize(Size.S);
      else if(width>34&&width<38)
     super.setcustomerSize(Size.M);
       else if(width>38&&width<42)
          super.setcustomerSize(Size.XL); 
        else if(width>42&&width<46)
          super.setcustomerSize(Size.XXL); 
      
     
  }    

      
    @Override
     public String toString() {
         List<Size>sizes=Arrays.asList(Size.values());
        return super.toString() +"if width is smaller than 32 optimum size is "+sizes.get(0)+"\n"
               
                +"if width is between 32 and 34  optimum size is"+sizes.get(1)+"\n"
                +"if width is between 34 and 38  optimum size is"+sizes.get(2)+"\n"
                +"if width is between 38 and 42  optimum size is"+sizes.get(3)+"\n"
                +"if width is between 38 and 42  optimum size is"+sizes.get(4)+"\n"
                +"if width is between 42 than 46  optimum size is"+sizes.get(5)+"\n";
            
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
