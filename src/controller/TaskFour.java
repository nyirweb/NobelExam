package controller;

import model.NobelModel;

public class TaskFour 
{
    
    public static void writeTaskFour()
    {
        for (NobelModel nobel : ReadNobelFile.nobelsList()) 
        {
            if(nobel.getDateOfNobel().equals("2017")&&nobel.getTypeOfNobel().equals("irodalmi"))
            {
                String name = nobel.getFirstName()+" "+nobel.getLastName();
                System.out.println("4. feladat: "+ name);
            }
        }
    }
    
}
