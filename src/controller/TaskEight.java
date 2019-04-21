package controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import model.MedicalNobelsModel;
import model.NobelModel;

public class TaskEight 
{
    
    public static void writeTaskEight()
    {
        TaskEight.medicalNobels();
        System.out.println("8. feladat: orvosi.txt létrehozva");
    }
    
    private static void medicalNobels()
    {
        ArrayList<MedicalNobelsModel> medicalNobelsArray = new ArrayList<>();
        ArrayList<String> medicalNobelsResult = new ArrayList<>();
        MedicalNobelsModel oneNobel;
        
        for (NobelModel nobelModel : ReadNobelFile.nobelsList()) 
        {
            String fullName = nobelModel.getFirstName()+" "+nobelModel.getLastName();
            String currentDate = nobelModel.getDateOfNobel();
            
            if(nobelModel.getTypeOfNobel().equals("orvosi"))
            {
                oneNobel = new MedicalNobelsModel();
                oneNobel.setFullName(fullName);
                oneNobel.setDateOfNobel(Integer.valueOf(currentDate));
            
                medicalNobelsArray.add(oneNobel);
            }
        }
        
        Collections.sort(medicalNobelsArray, 
                (Comparator.comparing(MedicalNobelsModel::getDateOfNobel)));

        for (MedicalNobelsModel medicalNobelsModel : medicalNobelsArray) 
        {
            String result = String.valueOf(medicalNobelsModel.getDateOfNobel()) +" : "+ medicalNobelsModel.getFullName();
            medicalNobelsResult.add(result);
            medicalNobelsFileCreate(medicalNobelsResult, "orvosi.txt");
        }
        
    }
    
    
    private static void medicalNobelsFileCreate(ArrayList<String> resultArray,String fileName)
    {
        try 
        {
            RandomAccessFile createFile = new RandomAccessFile(fileName, "rw");
            for (String line : resultArray) 
            {
                createFile.writeBytes(line+"\r"+"\n");
            }
        }
        catch (FileNotFoundException ex) 
        {
            System.out.println("Failed create file, fNotFoundEx: "+ex.getMessage());
        }
        catch (IOException ex) 
        {
            System.out.println("Failed create file, javaIOEx: "+ex.getMessage());
        }
    }
    
}
