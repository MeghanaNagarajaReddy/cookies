/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank;

/**
 *
 * @author Meghana
 */
public class Perishable extends Food {

    private int days;

    private int month;

    private int year;
    
    int monthDays[] = new int[12];

    public Perishable(int days, int month, int year, String name, String category, int quantity, double value) {
        super(name, category, quantity, value);
        this.days = days;
        this.month = month;
        this.year = year;
    }

    /**
     * Get the value of year
     *
     * @return the value of year
     */
    public int getYear() {
        return year;
    }

    /**
     * Set the value of year
     *
     * @param year new value of year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Get the value of month
     *
     * @return the value of month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Set the value of month
     *
     * @param month new value of month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Get the value of days
     *
     * @return the value of days
     */
    public int getdays() {
        return days;
    }

    /**
     * Set the value of days
     *
     * @param days new value of days
     */
    public void setdays(int days) {
        this.days = days;
    }

    /**
     * A method that checks the date, month and year on the label of the food and compares it to the present date,
     * month and year in order to calculate if a particular food item is expired. If it is not expired it returns 
     * the number of days, months and years left until a food item expires. 
     * @param presentDay takes an input value of the present date
     * @param presentMonth takes an input value of the present month
     * @param presentYear takes an input value of the present year
     */
    public void isExpired(int presentDay, int presentMonth, int presentYear) {
        int daysLeft = 0;
        int monthsLeft= 0;
        int yearsLeft = 0;
        //Calculation of the years left
        if (year < presentYear) {
            System.out.println(name + " is / are EXPIRED by years! Please dispose it!");
            return;
        } else if ((year - presentYear) == 0) {
            yearsLeft = 0;
            monthsLeft = 0;
            if (month < presentMonth) {
                System.out.println(name + " is / are EXPIRED by months! Please dispose it!");
            } else if ((month - presentMonth) == 0) {

                if (days < presentDay) {
                    System.out.println(name + " is / are EXPIRED by days! Please dispose it!");
                } 
            } 
        } 
        else {
            monthsLeft = 12* (year - presentYear);
        }
        monthsLeft += (month - presentMonth);
        if(days < presentDay){
            monthsLeft --;
            daysLeft = (daysInMonth(presentMonth) - presentDay) + days;
        }
        else{
            daysLeft = days - presentDay;
        }
        yearsLeft = monthsLeft / 12;
        monthsLeft = monthsLeft % 12;
        System.out.println("Years Left   --> " + yearsLeft + "\nMonths Left --> " + monthsLeft+ "\nDays Left   --> " + daysLeft);
        
    }
    /**
     * A method that takes in the number of the month in the present year and calculates how many days are left before
     * the product expires. For instance, an Apple expires on December 31st and the present date and month are
     * 23rd November. To calculate the number of days left in November: the switch statement goes to the 11th case
     * and subtracts 23 from 31 to return the number of days left in November and adds it to the number of days
     * in December in the method (isExpired) declared above. 
     * @param month
     * @return days left in a certain month according to the number of days in each month
     */

    public int daysInMonth(int month) {
        int days =0; 
        switch (month) {
            case 1:
                days = 31 - days;
                break;
            case 2:
                days = 29 - days;
                break;
            case 3:
                days = 31 - days;
                break;
            case 4:
                days = 30 - days;
                break;
            case 5:
                days = 31 - days;
                break;
            case 6:
                days = 30 - days;
                break;
            case 7:
                days = 31 - days;
                break;
            case 8:
                days = 31 - days;
                break;
            case 9:
                days = 30 - days;
                break;
            case 10:
                days = 31 - days;
                break;
            case 11:
                days = 30 - days;
                break;
            case 12:
                days = 31 - days;
                break;
            default:
                System.out.println("Sorry Wrong month entered, please enter 1 through 12 ONLY!");

        }
        return days;
    }

}
