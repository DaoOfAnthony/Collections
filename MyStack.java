import java.io.*;
import java.util.*;
import java.util.array;

public class MyStack
{
    // instance variables - replace the example below with your own
    private int stackData[];
    private int size; 

    public MyStack() {
        this.stackData = new int[10]; 
        size = 0;
    }
    
    public void push(int element) {
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
    
    public int pop() {
        if (size > 0) {
            return stackData[size-1];
            size--;
            stackData[size-1] = size;
            
            
        } else {
            return 0;
            System.out.println("does not exist"); 
        }
    }
    
    public int top() {
        return stackData[size];
    }
    
    public int size() {
        return size;
    }
    
    public boolean isFull()
    {
        if (size == stackData.length) {
            return true;
        } else {
            return false;
        }
    }
    
    public String toString()
    {
        return System.out.println(Arrays.toString(stackData));
    }
    
    
}

