package stack;

/**
 *
 * @author mohammed
 */
public class StackDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(7);
        stackArray.push(0);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        int terminal = stackArray.size();
        for (int i = 0; i < terminal; i++) {
            System.out.println(stackArray.pop());
        }

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.push(0);
        stackLinkedList.push(1);
        stackLinkedList.push(2);
        stackLinkedList.push(3);
        stackLinkedList.push(4);
        int length = stackLinkedList.size();
        for (int i = 0; i < length; i++) {
            System.out.println(stackLinkedList.pop());
        }
        
        
        
        StackArrayDynamic stackArrayDynamic = new StackArrayDynamic();
        stackArrayDynamic.push(0);
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");
        stackArrayDynamic.push(1);
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");
        stackArrayDynamic.push(2);
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");
        stackArrayDynamic.push(3);
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");
        stackArrayDynamic.push(4);
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");
         length = stackArrayDynamic.size();
        for (int i = 0; i < length; i++) {
              System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");

            System.out.println(stackArrayDynamic.pop());
        }
        System.out.println("");
        System.out.println(stackArrayDynamic.size());
        System.out.println(stackArrayDynamic.max());
        System.out.println("");

    }

}
