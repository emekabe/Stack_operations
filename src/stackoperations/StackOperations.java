package stackoperations;

/*
 * @author Emeka
 */

import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Stack <Integer> myStack = new Stack();
        
        /*  Common Stack operations  */
        //push(Integer)
        myStack.push(5);
        myStack.push(3);
        myStack.push(4);
        myStack.push(7);
        
        // [5, 3, 4, 7]
        System.out.println(myStack);
        
        //pop()
        myStack.pop();
        
        //[5, 3, 4]
        System.out.println(myStack);
        
        //peek
        
        // 4
        System.out.println(myStack.peek());
    }
}
