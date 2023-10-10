import java.io.*;
import java.util.*;

public class MyStackLL<E> {
    // instance variables
    MyLinkedList<E> stackData;  
    
    /**
     * Constructor for objects of class MyStackLL
     */
    public MyStackLL() {
        stackData = new MyLinkedList<E>();
    }
    
     /**
     * Pushes element to stack
     *
     * @param element pushed 
     */
    public void push(E element) {
        stackData.addHead(element);
    }
    
     /**
     * checks if the stack is empty 
     *
     * @return if empty 
     */
    public boolean isEmpty() {
        E temp = stackData.getHead();
        
        stackData.removeHead();
        return temp;
    }
    
     /**
     * Pop element from the stack
     *
     * @param element popped
     */
    public int pop() {
        if (!isEmpty()) {
            return stackData.size();
        } else {
            throw new NoSuchElementException();
        }
    }
    
    /**
     * reads element at the top of the stack
     *
     * @return element stored at top
     */
    public E top() {
        return stackData.head.getData();
    }

     /**
     * returns the number of elements in the stack
     *
     * @return data in stack
     */
    public int size() {
        return stackData.size();
    }
    
    /**
     * returns element of the stack from top to bottom
     *
     * @return toString
     */
    public String toString() {
        return stackData.toString();
    }
}

