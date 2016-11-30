package AllTasks.Task4.task.data;

import AllTasks.Task4.task.logic.PrimeNumber;

import java.util.ArrayList;
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
            System.out.print("N = ");
            int length = scanner.nextInt();
            if (length > 0)
            {
                int[] array =getArray(scanner,length);
                printIndexPrimeNumber(array);
            }
            else{
                    System.out.print("N must be > 0");}
        }
        catch (Exception exc)
        {
            System.out.printf("The entered data is invalid");
        }
    }

    private static int[] getArray(Scanner scanner, int length)
    {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("array[" + i +"] = ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printIndexPrimeNumber(int[] array)
    {
        PrimeNumber primeNumber = new PrimeNumber();
        ArrayList<Integer> arrayIndexPrimeNumber = primeNumber.getPrimeNumber(array);
        System.out.println("Indices of prime numbers: ");
        for(int i = 0; i<arrayIndexPrimeNumber.size(); i++)
            System.out.println(arrayIndexPrimeNumber.get(i));
    }
}
