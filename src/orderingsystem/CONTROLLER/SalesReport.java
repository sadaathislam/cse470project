/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem.CONTROLLER;

public class SalesReport{
    private double amount, cash, change;
    public SalesReport(double amount, double cash, double change){
        this.amount = amount;
        this.cash = cash;
        this.change = change;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    public double getCash(){
        return this.cash;
    }
    
    public double getChange(){
        return this.change;
    }
}
