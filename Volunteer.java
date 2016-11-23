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
public class Volunteer extends User {

    private double hoursWorked;
    private String tasks = null;
    //Constructor for the class Volunteer 
    public Volunteer(String name, int age, String ID, double hoursWorked, String tasks) {
        super(name, age, ID);
        this.hoursWorked = hoursWorked;
        this.tasks = tasks;
    }

    /**
     * Get the value of hoursWorked
     *
     * @return the value of hoursWorked
     */
    public Double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * Get the value of hoursWorked
     *
     * @return the value of hoursWorked
     */
    public String tasks() {
        return tasks;
    }

    /**
     * Set the value of hoursWorked
     *
     * @param hoursWorked new value of hoursWorked
     */
    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    /**
     * Set the value of hoursWorked
     *
     * @param tasks the name of the task a particular volunteer is working on
     */
    public void tasks(String tasks) {
        this.tasks = tasks;
    }

    /**
     * A method that adds all the tasks that a particular volunteer is working with and prints out their data along 
     * with the tasks they perform
     * @param task a String input that takes in the name of the task that the volunteer is performing
     */
    public void addTasks(String task) {
        if (tasks == null) {
            tasks = task;
        } else {
            tasks = tasks + ", " + task;
        }
        System.out.println("Tasks performed by " + name + " are : \n **" +tasks + "**");
        System.out.println("THANK YOU " + name + "!:) You are of great Help!!");
    }

}
