package AllTasks.Task2.tests;

import AllTasks.Task2.task.logic.Checker;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by Ника Тихоновец on 30.11.2016.
 */
public class Tests {
    Checker checker = new Checker();

    @Test
    public void rightTest(){
        assertTrue(checker.checkDot(3, 3));
    }

    @Test
    public void wrongTest(){
        assertFalse(checker.checkDot(6,6));
    }

    @Test
    public void nearTest(){
        assertTrue(checker.checkDot(5.9999999, -2.99999999));
    }
}
