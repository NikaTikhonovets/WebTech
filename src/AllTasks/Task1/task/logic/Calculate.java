package AllTasks.Task1.task.logic;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Calculate {

    public Double calculateValue(double x, double y)
    {
        Double resultCalculate;
        try
        {
            double numerator = 1 + Math.sin(x+y)*Math.sin(x+y);
            double denominator = 2 + Math.abs(x - 2*x/1+numberToTheSecondPower(x*y));
            resultCalculate = numerator / denominator;
            return resultCalculate;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Divide by zero exception.");
            return null;
        }
    }

    private double numberToTheSecondPower(double number)
    {
        double result = number * number;
        return result;
    }
}
