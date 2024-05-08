/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Doaa Said
 */
public abstract class  Denim extends Products {
  private Size customerSize;
   
    private String brand;


   
      public Denim( double price,int id ,String color,String brand){
      super(price,id,color);
     
      this.brand=brand;
      
      }

    

    public String getBrand() {
        return brand;
    }
    
    public Size getcustomerSize() {
        return customerSize;
    }
      
  

    public void setBrand(String brand) {
        this.brand = brand;
    }

  

    public void setcustomerSize(Size customerSize) {
        this.customerSize = customerSize;
    }

 @Override
  public double getOfferPercentage(){
    if(this.getPrice()<1500&&this.getPrice()>1000)  
      return 0.3;
    else if(this.getPrice()<1000&&this.getPrice()>600)
      return 0.2;
    else
        return 0;
  }

    @Override
    public String toString() {
        return super.toString() +" brand=" + brand +"\n";
    }
   
     }
    
    

