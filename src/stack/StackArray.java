package stack;

import java.util.Arrays;

/**
 *
 * @author mohammed
 */
public class StackArray {

    private int maxSize;
    private int top;
    private int[] arrayStack;

    public StackArray(int size) {
        this.maxSize = size;
        arrayStack = new int[size];
        top = 0;
    }

    public void push(int data) {
        if (isFull()) {
            System.err.println("Stack is full");
            return;
        }
        arrayStack[top++] = data;
    }

    public int pop() {
        int temp;
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;

        }

        return arrayStack[--top];
    }

    public boolean isFull() {

        return top == maxSize;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int max() {
        return maxSize;
    }

}
