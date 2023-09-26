import java.io.*;
import java.util.*;

public class MyStack<E> {
    // instance variables
    private E stackData[];
    private int size; 
    
    
    public MyStack() {
        stackData = (E[]) new Object[5];
        size = 0;
    }
    
    public void push(E element) {
        stackData[size] = element;
        size++;
    }
    
    public boolean isEmpty() {
        if (size == 0) {
           return true; 
        } else {
            return false;
        }
        
    }
    
    public E pop() {
        if (!isEmpty()) {
            size--;
            return stackData[size];
        } else {
            return stackData[-1];
        }
    }
    
    public E top() {
        return stackData[size];
    }
    
    public int size() {
        return size;
    }
    
    public boolean isFull() {
        if (size == stackData.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString() {
        String result = "";

        for (int i = 0; i < size; i++) {
            result = result + stackData[i].toString() + " ";
        }
    
        return result;
    }
}

