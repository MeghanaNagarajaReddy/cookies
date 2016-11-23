/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodbank;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Meghana
 */
public class Start {

    private Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Calling the Donor constrctuctor and sending in the name, age and ID as parameters
        Donor donor = new Donor("Ciara", 20, "800907623");
        System.out.println(donor.toString()); //Printing out the Donor Inforamtion
        //Calling the method add donations in order to add the donated item, quantity and their value
        donor.addDonations(new Food("Oreos", "Desserts", 6, 12.00));
        donor.addDonations(new Food("Apples", "Fruits", 20, 30.00));
        donor.printSummary(); //Method that prints out the summary of the donated items
        
        //Calling the Employee Constructor and sending their name, age, ID, position, hourly wage and their full time status as parameters
        Employee employee = new Employee("Paul", 20, "800907890", "Manager", 15.00, true);
        System.out.println(employee.toString()); //Printing out the Employee Information
        employee.calculateWage(); //Method that prints out the the calculated wage according to their working hours
        
        //Calling the Volunteer constructor and sending in their name, age, ID, hours of volunteer and their duty
        Volunteer volunteer = new Volunteer("Stephanie", 20, "800907981", 10, "Stocking");
        System.out.println(volunteer.toString()); //Printing out the Volunteer Information
        volunteer.addTasks("Sorting"); //Adds the tasks performed by the volunteer into an Array List as and when the user enters
        
        //Calling the Perishable constructor and sending in the date that is on the label of the food item, name, category, quantity and their value in dollars
        Perishable perishable = new Perishable(20, 10, 2018, "Oreos", "Sweets", 12, 20.00);
        System.out.println("\nFood Items and their Inforamtion in the Food Bank");
        System.out.println("Perishable Items with their expiration status: ");
        System.out.println(perishable.toString()); //Calling the method that prints out information of the food
        perishable.isExpired(21, 11, 2016); //Calling the method that takes in the prsent date and calculates a food item's shelf life if it is not expired
        Perishable p = new Perishable(18, 12, 2015, "Apples", "Fruits", 15, 15.00);
        System.out.println(p.toString()); //Calling the method that prints out all the detailed information of the food item that is passed in the second constructor
        p.isExpired(21, 11, 2016); //Calling the method that takes in the prsent date and calculates a food item's shelf life if it is not expired
        
        //Calling the Non_Perishable constructor and giving it the name, category, quantity and value in dollars of the food item
        Non_Perishable nonP = new Non_Perishable("Whole wheat", "Grain", 2, 30.00);
        System.out.println("The Non- Perishable Items: ");
        System.out.println(nonP.toString()); //Calling a method that prints out the detailed information of the non-perishable food that is donated

        Start start = new Start();
        start.addDonor();
        start.addEmployee();
        start.addVolunteer();
        start.addFood();

    }
    
    public void addDonor(){
        String name = null;
        int age = 0;
        String ID = null;
        System.out.println("\nDONOR CATALOG");
        System.out.println("Enter the name of the Donor");
        name = sc.next();
        System.out.println("Enter the age of the Donor");
        age = sc.nextInt();
        System.out.println("Enter the ID of the Donor");
        ID = sc.next();
        System.out.println("Donor " + name + "'s Information --> \n Age: "+ age + " \n ID:"+ ID);
       
    }

    /**
     * A method that takes a user input of the employee information and prints out details
     * along with their salary according to the hours worked and hourly wage they earn. 
     */
    public void addEmployee() {
        String name;
        int age;
        String ID;
        String title;
        boolean fullTime;
        double hourlyWage;
        
        System.out.println("\nEMPLOYEE CATALOG");
        System.out.println("Enter the Name of the employee");
        name = sc.next();
        System.out.println("Enter the Age of the employee ");
        age = sc.nextInt();
        System.out.println("Enter the ID of the employee");
        ID = sc.next();
        System.out.println("Enter the title of the employee");
        title = sc.next();
        System.out.println("Is the employee a full time worker? Enter True or False");
        fullTime = sc.nextBoolean();
        System.out.println("Enter the hourly wage of the employee");
        hourlyWage = sc.nextDouble();
        if (fullTime == true) {
            System.out.println("Employee " + name + "'s information -->  \n Position: " + title + ". \n Monthly Payment : " + (40 * hourlyWage) + " every week.\n ID: " + ID + "\n Age: " + age);
        } else {
            System.out.println("Employee " + name + "'s information -->  \n Position: " + title + ". \n Monthly Payment : " + (20 * hourlyWage) + " every week.\n ID: " + ID + "\n Age: " + age);
        }
    }
    public void addVolunteer(){
        String name;
        int age;
        String ID;
        String task;
        int hours;
        System.out.println("\nVOLUNTEER CATALOG");
        System.out.println("Enter the name of the Volunteer");
        name = sc.next();
        System.out.println("Enter the age of the Volunteer");
        age = sc.nextInt();
        System.out.println("Enter the ID of the Volunteer");
        ID = sc.next();
        System.out.println("Enter the task performed by the Volunteer");
        task = sc.next();
        System.out.println("How many hours does the Volunteer work for?");
        hours = sc.nextInt();
        System.out.println("Employee " + name + "'s information -->  \n Age: " + age + " \n ID: "+ ID + " \n Task Performed: "+ task + " \n Hours of Work: " + hours);

    }
    public void addFood(){
        boolean perishable;
        String name = null;
        double value;
        int quantity;
        String category;
        int presentDate;
        int presentMonth;
        int presentYear;
        int day;
        int month;
        int year;
        
        System.out.println("\nFOOD BANK");
        System.out.println("Please enter the name of the donated food item");
        name = sc.next();
        System.out.println("Please enter the category of the donated food item");
        category = sc.next();
        System.out.println("Please enter the number of the food items that are donated");
        quantity = sc.nextInt();
        System.out.println("Please enter the value of the items in a number format");
        value = sc.nextDouble();
        System.out.println("Please enter the category of the donated item. For Instance: Cookies - Dessert, Sandwich - Lunch.");
        category = sc.next();
        
        System.out.println("Do you want to deposit a Perishable item? \n--> Enter True or False");
        perishable = sc.nextBoolean();
        if(perishable == true){
            System.out.println("Please enter today's date");
            presentDate = sc.nextInt();
            System.out.println("Please enter present month from 1 - 12 ONLY");
            presentMonth = sc.nextInt();
            System.out.println("Please enter present year in four digits like 2016");
            presentYear = sc.nextInt();
            System.out.println("Please enter the date on the label of the food item");
            day = sc.nextInt();
            System.out.println("Please enter the month on the label of the food item");
            month = sc.nextInt();
            System.out.println("Please enter the year on the label of the food ");
            year = sc.nextInt();
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

                if (day < presentDate) {
                    System.out.println(name + " is / are EXPIRED by days! Please dispose it!");
                } 
            } 
        } 
        else {
            monthsLeft = 12* (year - presentYear);
        }
        monthsLeft += (month - presentMonth);
        if(day < presentDate){
            monthsLeft --;
        }
        else{
            daysLeft = day - presentDate;
        }
        yearsLeft = monthsLeft / 12;
        monthsLeft = monthsLeft % 12;
        System.out.println("  " + name + " \n  Categorized as --> " + category + " \n  Quantity       --> " + quantity + " " + name + "  \n  Value          --> $" + value);
        System.out.println("Years Left   --> " + yearsLeft + "\nMonths Left --> " + monthsLeft+ "\nDays Left   --> " + daysLeft);
        }
        System.out.println(" "+ name + " \n  Categorized as --> " + category + " \n  Quantity       --> " + quantity + " " + name + "  \n  Value          --> $" + value);
    }

}
