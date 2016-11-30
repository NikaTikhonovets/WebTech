package AllTasks.Task1.tests;

import AllTasks.Task1.task.logic.Calculate;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Tests {
    Double actual;
    Calculate calculator = new Calculate();

    @Test
    public void TestRight() {
        actual = calculator.calculateValue(0, 0);
        assertTrue(actual.compareTo(0.5) == 0);
    }

    @Test
    public void TestBigNumber() {
        actual = calculator.calculateValue(999999999, 999999999);
    }
}
