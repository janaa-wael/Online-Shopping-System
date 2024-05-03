/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Jana Wael
 */
import java.util.Date;

public interface Offer {
    public void displayDescription(); //displays or prints description of the offer

    public double  getPriceAfterDiscount(double price , double percentage); //multiplies the price with the 

    public boolean isOfferAvailable(); //checks whether the offer is available for the product or not

    public double getOfferPercentage(); //returns the percentage of the offer 
    
    public Date getStartDate();

    public Date getEndDate();
}
