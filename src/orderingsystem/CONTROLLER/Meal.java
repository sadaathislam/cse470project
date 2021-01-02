/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem.CONTROLLER;

import javax.swing.JOptionPane;


public class Meal {
    private String meal;
    private double price;

    public Meal(String meal, double price){
        this.meal = meal;
        this.price = price;
    }
    /**
     * @return the meal
     */
    public String getMeal() {
        return meal;
    }

    /**
     * @param meal the meal to set
     */
    public void setMeal(String meal) {
        this.meal = meal;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
}



