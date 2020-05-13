package week06.aufgabe01;

import java.util.Arrays;
import java.util.EmptyStackException;


public class Stack {

    private Object[] stack;
    private int index = 0;
    /*Constructor that initializes the stack with a maximum capacity
    (maximum number of elements).Conditions: capacity> 0 and capacity <= 65536*/
    public Stack(int capacity) throws IllegalStackCapacityException {
        initializeStackCapacity(capacity);
    }

    /*Put an element on top of the stack.
    Conditions: stack must not be full. Element cannot be null.*/
    public void push(Object element) throws StackIsFullException, NullPointerException {
        if (isStackFull())
            throw new StackIsFullException();
        if (element == null)
            throw new NullPointerException("\n\tStack does not accept any null values.");
        stack[index++] = element;
    }

    /*Takes the top element off the stack and returns it.
    Conditions: stack must not be empty.*/
    public Object pop() throws EmptyStackException{
        if (isStackEmpty())
            throw new EmptyStackException();
        else {
            Object o = stack[--index];
            stack[index] = null;
            return o;
        }
    }

    /*Returns the current number of elements on the stack.*/
    public int size() {
        return index;
    }

    /*Returns the capacity of the stack.*/
    public int capacity() {
        return stack.length;
    }

    public void initializeStackCapacity(int cap) throws IllegalStackCapacityException {
        if (cap > 0 && cap <= 65536) {
            stack = new Object[cap];
        } else {
            throw new IllegalStackCapacityException(cap);
        }
    }

    public boolean isStackFull() {
        int counter = 0;
        for (Object i : stack) {
            if (i == null)
                counter++;
            if (counter >= 1)
                break;
        }
        return counter >= 1 ? false : true;
    }

    public boolean isStackEmpty() {
        for (Object i : stack)
            if (i != null)
                return false;
        return true;
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }

}


