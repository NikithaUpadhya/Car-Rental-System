/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment;
import java.nio.file.Path;
import java.nio.file.Paths;
/**
 *
 * @author leelynnchanel
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Path path1 = Paths.get("/Users/leelynnchanel/Desktop/3rd Semester/Java/Assignment/cars.txt");
        System.out.println("\n[Path] : " + path1);
        System.out.println(path1);
    }
    
}
