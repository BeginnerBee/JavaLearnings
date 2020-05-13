package week06.aufgabe01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAufgabe01 {

    @Test
    public void whenIllegalStackCapacityExceptionThrown_thenAssertionSucceeds() {
        int illegalCapacity = -5;
        Exception exception = assertThrows(IllegalStackCapacityException.class, () -> {
            Stack s = new Stack(illegalCapacity);
        });

        String expectedMessage = "\n\tExpected value range: capacity > 0 and capacity <= 65536. " +
                "The value was entered: " + illegalCapacity + "\n\tDefault capacity of stack: 10";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenStackIsFullExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(StackIsFullException.class, () -> {
            try {
                Stack s = new Stack(1);
                s.push(1);
                s.push(2);
                s.push(3);
            } catch (IllegalStackCapacityException e) {
                System.out.println(e.fillInStackTrace());
            }
        });

        String expectedMessage = "\n\tThere is no enough space";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenAddingNullObjectToStack_thenAssertionSucceeds() {
        Exception exception = assertThrows(NullPointerException.class, () -> {
            try {
                Stack s = new Stack(1);
                s.push(null);
            } catch (IllegalStackCapacityException e) {
                System.out.println(e.fillInStackTrace());
            }
        });

        String expectedMessage = "\n\tStack does not accept any null values.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void whenPoppingObjectFromEmptyStack_thenAssertionSucceeds() {
        Exception exception = assertThrows(EmptyStackException.class, () -> {
            try {
                Stack s = new Stack(10);
                s.pop();
            } catch (IllegalStackCapacityException e) {
                System.out.println(e.fillInStackTrace());
            }
        });
    }

    @Test
    public void whenPoppingObjectWhichReturnsTopElement_thenAssertionSucceeds() {
        try {
            Object o1 = new Object();
            Object o2 = new Object();
            Stack s = new Stack(2);
            s.push(o1);
            s.push(o2);
            Object o3 = s.pop();
            Assertions.assertEquals(o2, o3);
        } catch (IllegalStackCapacityException | StackIsFullException e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}

