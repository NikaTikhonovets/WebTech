package AllTasks.Task2.task.data;

import AllTasks.Task2.task.logic.Checker;

import java.util.Scanner;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        try
        {
            System.out.print("x = ");
            double x = scanner.nextDouble();
            System.out.print("y = ");
            double y = scanner.nextDouble();
            scanner.close();
            Checker checker = new Checker();
            System.out.print("IsInRegion = "+checker.checkDot(x, y));
        }
        catch (Exception exc){
            System.out.printf("The entered data is invalid");
        }

    }
}
