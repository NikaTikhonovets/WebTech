package AllTasks.Task3.task.data;

import AllTasks.Task3.task.logic.Function;

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
            System.out.print("a = ");
            double a = scanner.nextDouble();
            System.out.print("b = ");
            double b = scanner.nextDouble();
            System.out.print("h = ");
            double h = scanner.nextDouble();
            if(Function.checkData(a, b, h))
            {
                Function function = new Function();
                double[] tabRes = function.calculateTangent(a,  b,  h);
                displayResult(tabRes, a, h);
            }

        }
        catch (Exception exc){
            System.out.printf("The entered data is invalid");
        }
    }

    static void displayResult(double[] result, double a, double h){
        System.out.println("----------------------------");
        System.out.println("|  x  |     F(x)");
        System.out.println("----------------------------");

        for (int i = 0; i<result.length; i++)
        {
            System.out.println("| " +(a+i*h)+" | "+result[i] );
        }
    }
}
