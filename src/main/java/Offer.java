/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Jana Wael
 */

import java.time.LocalDate;
public interface Offer {
    public void displayDescription(); //displays or prints description of the offer

    public double  getPriceAfterDiscount(); //multiplies the price with the 

    public boolean isOfferAvailable(); //checks whether the offer is available for the product or not

    public double getOfferPercentage(); //returns the percentage of the offer 
    
    public LocalDate getStartDate();   //returns the start date of the offer

    public LocalDate getEndDate();     //returns the end date of the offer
}
