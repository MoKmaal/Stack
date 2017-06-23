package stack;

import LinkedList.LinkedList;
import LinkedList.Node;

/**
 *
 * @author mohammed
 */
public class StackLinkedList {

    LinkedList linkedListStack;

    public StackLinkedList() {
        linkedListStack = new LinkedList(null);

    }

    public void push(int data) {
        linkedListStack.addFirst(new Node(data, null));
    }

    public int pop() {
        return linkedListStack.deleteFirst().value;
    }

    public boolean isEmpty() {
        return linkedListStack.isEmpty();
    }

    public int size() {
        return linkedListStack.size();
    }

}
