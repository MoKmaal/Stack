package LinkedList;

/**
 *
 * @author mohammed
 */
public class LinkedList {

    private Node head;
    private Node temp;
    private Node temp2;
    private int counter;

    public LinkedList(Node head) {
        this.head = head;
    }

    public void addFirst(Node newNode) {
        if (head == null) {
            head = newNode;
            head.next = null;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(Node newNode) {
        if (head == null) {
            addFirst(newNode);
        } else {
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = null;

        }
    }

    public Node deleteFirst() {
        if (isEmpty()) {
            System.err.println("Empty LinkedList");
        } else {
            temp2 = head;
            temp = head;
            head = head.next;

        }
        return temp2;
    }

    public void deleteLast() {

        if (head.next == null) {
            deleteFirst();
        } else {
            temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void display() {
        temp = head;
        while (temp != null) {

            System.out.println("Val " + temp.value);
            temp = temp.next;
        }
    }

    public int size() {
        counter = 0;
        temp = head;
        while (temp != null) {
            temp = temp.next;
            counter++;
        }
        return counter;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void add(Node newNode, int index) {
        int size = size();
        temp = head;
        temp2 = head.next;
        if (index >= size) {
            addLast(newNode);
        } else {
            for (int j = 0; j < index - 1; j++) {
                temp = temp.next;
                temp2 = temp2.next;
            }

            temp.next = newNode;
            newNode.next = temp2;
        }
    }

    public void delete(int index) {
        int size = size();
        temp = head;
        temp2 = head.next.next;
        if (index >= size) {
            deleteLast();
        } else {
            for (int j = 0; j < index - 1; j++) {
                temp = temp.next;
                temp2 = temp2.next;
            }
            temp.next = temp2;
        }
    }

    public Node getFirst() {
        return head;
    }

    public Node getLast() {
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public Node get(int index) {
        int size = size();
        temp = head;
        if (index == 0) {
            return getFirst();
        } else if (index >= size) {
            return getLast();
        } else {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }

}
