
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aziza
 */
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
public abstract class Sportswear extends Products{
    
    //constructor to initialize the price, id, color and size of the sportwear
    public Sportswear(double price,int id  ,String color){
        super(price,id,color);
    }
    //constructor to initialize the price, id, color, size, startOfferDate and endOfferDate of the sportwear
    public Sportswear( double price, int id, LocalDate startOfferDate, LocalDate endOfferDate ,String color){
        super(price,id,startOfferDate,endOfferDate,color);
    }
    
    //method determine the percentage of the offer depending on the price of the product
    @Override
    public double getOfferPercentage() {
        if(super.getPrice() >= 300 && super.getPrice() <= 500)
            return 0.10;    // 10% discount
        else if(super.getPrice() > 500 && super.getPrice() <= 700)
            return 0.15;    // 15% discount
        else if(super.getPrice() > 700 && super.getPrice() <= 900)
            return 0.30;    // 30% discount
        else if(super.getPrice() > 900 && super.getPrice() <= 1100)
            return 0.35;    // 35% discount
        else if(super.getPrice() > 1100 && super.getPrice() <= 1300)
            return 0.40;    // 40% discount
        else if(super.getPrice() > 1300)
            return 0.50;    // 50% discount  >> maximum discount
        else 
            return 0;       // no discount on pruducts whose prices are less than 300 LE
    }
    
    //method return a string descripes the product
    @Override
    public String toString() {
        List<Size> arr=Arrays.asList(Size.values());
        return super.toString() 
                +"\n"+"size: "+arr.get(0)+", "+arr.get(1)+", "+arr.get(2)+", "+arr.get(3)+", "+arr.get(4)+", "+arr.get(5)+", "+arr.get(6);
    }
    
    
}


