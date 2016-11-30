package AllTasks.Task1.task.data;

import AllTasks.Task1.task.logic.Calculate;

import java.util.Scanner;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double x = 0,y = 0;
        try
        {
            System.out.print("x = ");
            x = scanner.nextDouble();
            System.out.print("y = ");
            y = scanner.nextDouble();
            scanner.close();

            Calculate calculator = new Calculate();
            Double result = calculator.calculateValue(x, y);

            if (result != null)
                System.out.println("Result = "+result);
        }
        catch (Exception exc){
            System.out.printf("The entered data is invalid!");
        }

    }
}
