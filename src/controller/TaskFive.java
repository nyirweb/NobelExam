package controller;

import java.util.ArrayList;
import model.NobelModel;

public class TaskFive 
{
    public static void writeTaskFive()
    {
        System.out.println("5. feladat: ");
        
        ArrayList<NobelModel> nobels = ReadNobelFile.nobelsList();
        
        nobels.remove(0);
        for (NobelModel nobel : nobels) 
        {
            int currentDate = Integer.valueOf(nobel.getDateOfNobel());
            if(currentDate >= 1990 && nobel.getTypeOfNobel().equals("béke"))
            {
                if(nobel.getLastName().equals(""))
                {
                    String result = nobel.getDateOfNobel()+": "+nobel.getFirstName();
                    System.out.println(result);
                }
            }
        }

    }
    
}
