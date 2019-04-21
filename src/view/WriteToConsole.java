package view;

import controller.TaskEight;
import controller.TaskFive;
import controller.TaskFour;
import controller.TaskSeven;
import controller.TaskSix;
import controller.TaskThree;

public class WriteToConsole {

    public static void main(String[] args)
    {
        // start application here!
        TaskThree.writeTaskThree();
        TaskFour.writeTaskFour();
        TaskFive.writeTaskFive();
        TaskSix.writeTaskSix();
        TaskSeven.writeTaskSeven();
        TaskEight.writeTaskEight();
    }
    
}
