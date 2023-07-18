/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author leelynnchanel
 */
public class NewBooking {
    private String carReg;
    private String cusUsername;
    private String cusName;
    private String cusEmail;
    private String cusNum;
    private String carType;
    private String pickup;
    private String dropoff;
    
  
    public NewBooking(String reg, String cu, String cn, String ce, String cnum, String ct,String pick, String drop ){
        carReg = reg ; 
        cusUsername = cu;
        cusName = cn;
        cusEmail = ce;
        cusNum = cnum;
        carType = ct;
        pickup = pick;
        dropoff = drop;
    }
    
    public String getReg() {
        return carReg;
    }
    
    public void setReg(String reg){
        carReg = reg;
    }
    
    public String getCar() {
        return carType;
    }
    
    public void setCar(String car){
        carType = car;
    }
    
    public String getUsername() {
        return cusUsername;
    }
    
    public void setUser(String username){
        cusUsername = username;
    }
    
    public String getName() {
        return cusName;
    }
    
    public void setName(String name){
        cusName = name;
    }
    
    
    public String getEmail() {
        return cusEmail;
    }
    
    public void setEmail(String email){
        cusEmail = email;
    }
    
    public String getNum() {
        return cusNum;
    }
    
    public void setNum(String num){
        cusNum = num;
    }
    
    public String getPick() {
        return pickup;
    }
    
    public void setPick(String p){
        pickup = p;
    }
    
    public String getDrop() {
        return dropoff;
    }
    
    public void setDrop(String d){
        dropoff = d;
    }
    
}
