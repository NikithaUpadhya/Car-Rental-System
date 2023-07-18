/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author leelynnchanel
 */
public class CarClass {
    private String RegNum;
    private String Brand;
    private String Model;
    private String Availability;
    private double Price;
    
    public CarClass(String regnum, String brand, String model, String availability, double price){
        RegNum = regnum;
        Brand = brand;
        Model = model;
        Availability = availability;
        Price = price;
        
    }
    public String getRegNum() {
        return RegNum;
    }
    public String getBrand(){
        return Brand;
    }
    
    public String getModel(){
        return Model;
    }
    
     public String getAvailability(){
        return Availability;
    }
    
    public double getPrice(){
        return Price;
    }
    
    
    
}
