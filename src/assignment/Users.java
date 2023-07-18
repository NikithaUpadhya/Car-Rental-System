/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

/**
 *
 * @author leelynnchanel
 */
public class Users {
    
    
   private String Name;
    private String Username;
    private String Email;
    private String Number;
    private String Password;
    
    public Users (String name, String username, String email, String number, String password){
        Name = name;
        Username = username;
        Email = email;
        Number = number;
        Password = password;
    }
    
     public String getName(){
        return Name;
    }
     
     public void setName(String n){
     n = Name;
     }
    
    
    public String getUsername(){
        return Username;
    }
    
    public void setUsername(String un){
        un = Username;
    }
    
    public String getNumber(){
        return Number;
    }
    
    public void setNumber(String phoneNumber){
        Number = phoneNumber;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String email){
        Email = email;
    }
    
    public String getPassword(){
        return Password;
    }
    
    public void setPassword(String password){
        Password = password;
    }
    
}
