package AllTasks.Task3.task.logic;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Function {

    public static boolean checkData(double a, double b, double h)
    {
        if(a >= b){
            System.out.println("a must be < b! ");
            return false;
        }
        if(h > b - a){
            System.out.println("h must be <= b - a !");
            return false;
        }
        if(h <= 0){
            System.out.println("h must be > 0 !");
            return false;
        }
        return true;
    }

    public double[] calculateTangent(double a, double b, double h)
    {
        int length = (int)((b - a) / h);
        double[] tableResult = new double[length];

        for (int i = 0; i< length; i++)
            tableResult[i]=Math.tan(a+i*h);

        return tableResult;
    }
}
