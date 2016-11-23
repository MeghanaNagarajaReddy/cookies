/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank;

import java.util.ArrayList;

/**
 *
 * @author Meghana
 */
public class Donor extends User {

    private double donationValue = 0.0;
    private ArrayList<Food> donationHistory = new ArrayList<>();

    public Donor(String name, int age, String ID) {
        super(name, age, ID);
    }

    /**
     * Get the value of donationValue
     *
     * @return the value of donationValue
     */
    public double getDonationvalue() {
        return donationValue;
    }

    /**
     * Set the value of donationValue
     *
     * @param donationValue new value of donationValue
     */
    public void setDonationvalue(double donationValue) {
        this.donationValue = donationValue;
    }

    /**
     * A method to have a catalog entry of all the items that each donor has
     * brought and enter it into their history of donated items using an array
     * list. Also calculates the donation value of each item and sums it up.
     *
     * @param item The name of the food item that is donated which is of the
     * type "Food"
     */
    public void addDonations(Food item) {
        donationHistory.add(item);
        donationValue = item.getValue() + donationValue;

    }

    /**
     * A method to print the summary of the all the donations that a particular
     * user has donated It prints out a list of all the items, their value and
     * the quantity of each item that the donor has contributed to the Food
     * Bank.
     */
    public void printSummary() {
        System.out.println(name + "'s Donation History: ");
        //for loop to go through every person's donations
        for (int i = 0; i < donationHistory.size(); i++) {
            System.out.println(donationHistory.get(i).toString());
        }
        //Prints out a Thank you message for the donor and the final sum total of doantions
        System.out.println("The total value of the donated items is : $" + donationValue);
        System.out.println("THANK YOU " + name + "!:) Your donations are highly Appreciated!");
    }
}
