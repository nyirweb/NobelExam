package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import model.NobelModel;

public class ReadNobelFile 
{
    public static ArrayList<NobelModel> nobelsList()
    {
        String fileName = "nobel.csv";
        
        ArrayList<NobelModel> nobels = new ArrayList<>();
        NobelModel oneNobel;
        
        RandomAccessFile fileReader;
        String line = "";
        String lineUTF = "";
        String[] slices = new String[4];
        
        try
        {
            fileReader = new RandomAccessFile(fileName,"r");
            line = fileReader.readLine();
            while(line != null)
            {

                lineUTF = new String(line.getBytes("ISO-8859-1"));
                slices = lineUTF.split(";");

                oneNobel = new NobelModel();

                if(slices.length == 3)
                {
                    oneNobel.setDateOfNobel(slices[0]);
                    oneNobel.setTypeOfNobel(slices[1]);
                    oneNobel.setFirstName(slices[2]);
                    oneNobel.setLastName("");
                }else
                {
                    oneNobel.setDateOfNobel(slices[0]);
                    oneNobel.setTypeOfNobel(slices[1]);
                    oneNobel.setFirstName(slices[2]);
                    oneNobel.setLastName(slices[3]);
                }
                
                nobels.add(oneNobel);
                line = fileReader.readLine();
            }
            
            fileReader.close();
            
        }catch (FileNotFoundException ex) 
        {
            System.out.println("when read nobel.csv FileNotFoundException : "+ex.getMessage());
        } catch (IOException ex) 
        {
            System.out.println("when read nobel.csv IOException : "+ex.getMessage());
        }
        return nobels;
    }    
}
