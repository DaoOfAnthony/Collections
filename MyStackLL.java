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
    
    public void push(E element) {
        stackData.addHead(element);
       
    }
    
    public boolean isEmpty() {
        if (stackData.head == null) {
           return true; 
        } else {
            return false;
        }
        
    }
    
    public int pop() {
        if (!isEmpty()) {
            return stackData.size();
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public E top() {
        return stackData.head.getData();
    }
    
    public int size() {
        return stackData.size();
    }
    
    public boolean isFull() {
        return false;
    }
    
    public String toString() {
        Node curNode = stackData.head; 
        String result = "";

        for (int i = 0; i < stackData.size(); i++) {
            result = result + curNode.getData() + " ";
            curNode = curNode.getNext();
        }
    
        return result;
    }
}

