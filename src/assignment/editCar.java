/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author leelynnchanel
 */
public class editCar {
    
    public int modify_file_admin(String id1,String brand,String mod, String status, String price, int found)
    { 
        try
        {
            Path p = Paths.get(".", "cars.txt");
            Path tempFile = Files.createTempFile(p.getParent(), "PendingTemp", ".txt");
            try (BufferedReader reader = Files.newBufferedReader(p);
                BufferedWriter writer = Files.newBufferedWriter(tempFile))
            {
                String line123;
                // copy everything until the id is found
                while ((line123 = reader.readLine()) != null)
                {
                    String[] fields = line123.split("[,]");
                    System.out.println(fields[0]);
                    if (id1.equals(fields[0]))
                    {
                        found = 1;
                        
                        fields[0] = id1;
                        fields[1] = brand;
                        fields[2] = mod;
                        fields[3] = status;
                        fields[4] = price;
                       
                    
                    }
                    writer.write(String.join(",", fields));
                    writer.newLine();
                }             
            }
            // copy new file & delete temporary file
            Files.copy(tempFile, p, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(tempFile);
           
        }catch (IOException ex){} 
        return found;
    }   
}
