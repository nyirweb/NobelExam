package controller;

import model.NobelModel;

public class TaskSix 
{
    
    public static void writeTaskSix()
    {
        System.out.println("6. feladat: ");
        String s = "Curie";
        for (NobelModel nobelModel : ReadNobelFile.nobelsList()) 
        {
            String fullName = nobelModel.getFirstName()+" "+nobelModel.getLastName();
            
            if(fullName.contains(s))
            {
                String typeOfNobel = nobelModel.getTypeOfNobel();
                String dateOfNobel = nobelModel.getDateOfNobel();
                System.out.println(dateOfNobel+": "+fullName+"("+typeOfNobel+")");
            }
        }
    }
}
