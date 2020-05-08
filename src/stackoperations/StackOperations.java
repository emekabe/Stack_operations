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
        
        
        /*  Auxiliary stack operations  */
        
        // Size
        
        // 3
        System.out.println(myStack.size());
        
        // is empty
        
        // false
        System.out.println(myStack.empty());
        // or
        System.out.println(myStack.isEmpty());
    }
}
