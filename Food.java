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
public class Food {

    String name;

    String category;

    int quantity;

    double value;

    public Food(String name, String category, int quantity, double value) {
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.value = value;
    }

    /**
     * Get the value of value
     *
     * @return the value of value
     */
    public double getValue() {
        return value;
    }

    /**
     * Set the value of value
     *
     * @param value new value of value
     */
    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * Get the value of quantity
     *
     * @return the value of quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Set the value of quantity
     *
     * @param quantity new value of quantity
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Get the value of category
     *
     * @return the value of category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Set the value of category
     *
     * @param category new value of category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A toString method that is responsible for finding each user's donated
     * items, quantity of the items, category, and their value in Dollars.
     *
     * @return the name, quantity, category and value of the donated items of
     * each user. 
     *
     */
    @Override
    public String toString() {
        return "  " + name + " \n  Categorized as --> " + category + " \n  Quantity       --> " + quantity + " " + name + "  \n  Value          --> $" + value;

    }
}
