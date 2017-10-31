/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author Praktikum
 */
public class Goods {
    private String description;
    private double price;
    
    public Goods(String description, double price){
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

   public void setPrice(double price) {
        this.price = price;
    }
    
    
    
}
