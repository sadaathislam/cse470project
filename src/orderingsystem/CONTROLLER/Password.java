/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderingsystem.CONTROLLER;

import javax.swing.JOptionPane;

public class Password{
    private String pass;
    private int tries = 3;
    public Password(String pass){
        this.pass = pass;
    }
    public void tryAgain(){
        this.tries--;
        JOptionPane.showMessageDialog(null, "You have "+this.tries+" try left!");
    }
    
    public String getPassword(){
        return this.pass;
    }
    public int getTries(){
        return this.tries;
    }
}
