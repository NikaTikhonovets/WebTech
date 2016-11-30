package AllTasks.Task3.tests;

import AllTasks.Task3.task.logic.Function;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Tests {
    Function function = new Function();
    double result[];

    @Test
    public void rightTest() {
        result = function.calculateTangent(0, 5, 1);
        assertEquals(0, result[0], 0);
    }
}
