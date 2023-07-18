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
public class Deletecars {
    
    public int modify_file_admin(String id1,String brand,String mod, String status, String price, int found)
    { 
        try
        {
            Path p = Paths.get(".", "cars.txt");
            Path tempFile = Files.createTempFile(p.getParent(), "PendingTemp", ".txt");
            try (BufferedReader reader = Files.newBufferedReader(p);
                BufferedWriter writer = Files.newBufferedWriter(tempFile))
            {
                String line33= id1+","+brand+","+mod+","+ status+","+price;
                String line123;
                
                //   System.out.print(line33);
                // copy everything until the id is found
                while ((line123 = reader.readLine()) != null)
                {
                    
                    String trimmedLine = line123.trim();
                    if (trimmedLine.equals(line33)) continue;
                    
                    writer.write(line123 + System.getProperty("line.separator"));
                    found=1;
                      
                }             
            }
            // copy new file & delete temporary file
            Files.copy(tempFile, p, StandardCopyOption.REPLACE_EXISTING);
            Files.delete(tempFile);
           
        }catch (IOException ex){}
        return found;
    }   
}
