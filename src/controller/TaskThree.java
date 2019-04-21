package controller;

import java.util.ArrayList;
import model.NobelModel;

/**
 *
 * @author Acer
 */
public class TaskThree 
{   
    
    private static String result()
    {
        String result = "3. feladat: ";
        
        for (NobelModel nobelModel : ReadNobelFile.nobelsList()) 
        {
            String name = nobelModel.getFirstName()+nobelModel.getLastName();
            if(name.equals("Arthur B.McDonald"))
            {
                return "3. feladat: " + nobelModel.getTypeOfNobel();
            }
        }
        return result;
    }
    
    
    public static void writeTaskThree()
    {
        System.out.println(TaskThree.result());
    }
}
