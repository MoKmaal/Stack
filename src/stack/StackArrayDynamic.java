package stack;

import java.util.Arrays;

/**
 *
 * @author mohammed
 */
public class StackArrayDynamic {

    private int top;
    private int[] dynamicArrayStack;

    public StackArrayDynamic() {
        dynamicArrayStack = new int[1];
        top = 0;
    }

    public void push(int data) {
        checkCapacity(top + 1);
        dynamicArrayStack[top++] = data;
    }

    public int pop() {
        int temp;
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;

        }
        checkCapacity(top-1);

        return dynamicArrayStack[--top];
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public int size() {
        return top;
    }

    public int max() {
        return dynamicArrayStack.length;
    }

    public void checkCapacity(int minCapacity) {
        int oldCapacity = dynamicArrayStack.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            dynamicArrayStack = Arrays.copyOf(dynamicArrayStack, newCapacity);
        }else if(minCapacity<oldCapacity/2){
                        int newCapacity = oldCapacity /2;
            dynamicArrayStack = Arrays.copyOf(dynamicArrayStack, newCapacity);

        }

    }

}
