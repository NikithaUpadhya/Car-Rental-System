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
public class edit {
     public int modify_file_admin(String id1,String num1,String cus1, String add1, String rent1, String ret1, String fee1, int found)
    { 
        try
        {
            Path p = Paths.get(".", "Rental.txt");
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
                        fields[1] = num1;
                        fields[2] = cus1;
                        fields[3] = add1;
                        fields[4] = rent1;
                        fields[5] = ret1;
                        fields[6] = fee1;
                    
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
