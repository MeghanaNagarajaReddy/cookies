/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank;

import java.util.Scanner;

/**
 *
 * @author Meghana
 */
public class Employee extends User {

    private String title;

    private Double hourlyWage;

    private Boolean fullTime;

    public Employee(String name, int age, String ID, String title, Double hourlyWage, Boolean fullTime) {
        super(name, age, ID);
        this.title = title;
        this.hourlyWage = hourlyWage;
        this.fullTime = fullTime;
    }

    /**
     * Set the value of fullTime
     *
     * @param fullTime new value of fullTime
     */
    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }

    /**
     * Get the value of hourlyWage
     *
     * @return the value of hourlyWage
     */
    public Double getHourlyWage() {
        return hourlyWage;
    }

    /**
     * Set the value of hourlyWage
     *
     * @param hourlyWage new value of hourlyWage
     */
    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    /**
     * Get the value of title
     *
     * @return the value of title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Set the value of title
     *
     * @param title new value of title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * A method to calculate the earnings of the employee depending on the
     * number of hours they have worked, hourly wage and the tasks that they do
     * according to their position. The method also prints out information of
     * the employee in a systematical order.
     */
    public void calculateWage() {
        //if statement to check if the employee if a full time worker
        if (fullTime == true) {
            System.out.println("  Position  --> " + title + ". \n  Salary    --> $" + (40 * hourlyWage));
        } else {
            System.out.println("  Position  --> " + title + ". \n  Salary    --> $" + (20 * hourlyWage));
        }
    }
}
