package AllTasks.Task4.task.logic;

import java.util.ArrayList;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class PrimeNumber {

    public ArrayList<Integer> getPrimeNumber(int[] array)	{
        ArrayList<Integer> arrayIndexPrimeNumber = new ArrayList<Integer>();
        for(int i = 0; i < array.length; i++)
            if(checkPrime(array[i]))
                arrayIndexPrimeNumber.add(i);
        return arrayIndexPrimeNumber;
    }
    private boolean checkPrime(int number){
        if(number > 1){
            for (int i = 2; i <= Math.sqrt(number); i++)
                if ((number % i) == 0)
                    return false;
            return true;
        }
        return false;
    }
}
