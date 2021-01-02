/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem.CONTROLLER;

public class Order{
    private String meal;
    private double price;
    private int quantity;
    private double amount;
    
    public Order(String meal, double price, int qty){
        this.meal = meal;
        this.price = price;
        this.quantity = qty;
    }
    
    public String getMeal(){
        return this.meal;
    }
    public double getPrice(){
        return this.price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    
    public double getAmount(){
        this.amount = this.price*this.quantity;
        return this.amount;
    }
}
