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
public class Modify_Record {
    
    public int modify_file_admin(String CarRegNum1,String Cartype1,String pickdate1,String returndate1,String total1, String username1,String name1,String email1,String phonenumber1,int found)
    { 
        try
        {
            Path p = Paths.get(".", "RentalBooking.txt");
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
                    if (CarRegNum1.equals(fields[0]))
                    {
                        found = 1;
                        
                        fields[0] = CarRegNum1;
                        fields[1] = Cartype1;
                        fields[2] = pickdate1;
                        fields[3] = returndate1;
                        fields[4] = total1;
                        fields[5] = username1;
                        fields[6] = name1;
                        fields[7] = email1;
                        fields[8] = phonenumber1;
                        
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
