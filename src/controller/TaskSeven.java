package controller;

import model.NobelModel;

public class TaskSeven 
{
    
    private static String countAllNobels()
    {
        int physicalNobelCount = 0;
        int chemicalNobelCount = 0;
        int medicalNobelCount = 0;
        int literaryNobelCount = 0;
        int peaceNobelCount = 0;
        int economicsNobelCount = 0;
        
        String result = ""; 
        
        for (NobelModel nobelModel : ReadNobelFile.nobelsList()) 
        {
            String type = nobelModel.getTypeOfNobel();
            switch(type)
            {
                case "fizikai":
                    physicalNobelCount++;
                    break;
                case "kémiai":
                    chemicalNobelCount++;
                    break;
                case "orvosi":
                    medicalNobelCount++;
                    break;
                case "irodalmi":
                    literaryNobelCount++;
                    break;
                case "béke":
                    peaceNobelCount++;
                    break;
                case "közgazdaságtani":
                    economicsNobelCount++;
            }
            
        }
        
        String physicalNobel = "fizikai: "+physicalNobelCount + " db";
        String chemicalNobel = "kémiai: "+chemicalNobelCount + " db";
        String medicalNobel = "orvosi: "+medicalNobelCount + " db";
        String literaryNobel = "irodalmi: "+literaryNobelCount + " db";
        String peaceNobel = "béke: "+peaceNobelCount + " db";
        String economicsNobel = "közgazdaságtani: "+economicsNobelCount + " db";
        
        result = physicalNobel + "\n"+chemicalNobel+"\n"+medicalNobel+"\n"
                +literaryNobel+"\n"+peaceNobel+"\n"+economicsNobel;

        return result;
    }
    
    public static void writeTaskSeven()
    {
        System.out.println("7. feladat: ");
        System.out.println(TaskSeven.countAllNobels());
    }
    
}
