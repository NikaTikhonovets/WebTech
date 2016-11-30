package AllTasks.Task2.task.logic;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Checker {
    public boolean checkDot(double x, double y)
    {
        if(y > 0)
        {
            if((y <= 5)&&(x >= -4)&&(x <= 4))
                return true;
        }
        else
        {
            if ((y >= -3)&&(x >= -6)&& (x <= 6))
                return true;
        }

        return false;
    }
}
