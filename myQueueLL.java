import java.util.EmptyStackException;
import java.util.NoSuchElementException;

/*
*
* @author Anthony Yang
*
*/      
public class myQueueLL<E> {     
    MyLinkedList<E> queue;  

    /**
     * Constructor for objects of class MyQueue
     */  
    public myQueueLL() {     
        queue = new MyLinkedList<E>();
    }   
     
    // insert an element into the queue  
    public void enqueue(E element)  {   
        // check if the queue is full  
        if (queue.size() == 0) {   
            throw new NoSuchElementException();  
        }   
       
        else {     
            queue.addTail(element);   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    public E dequeue()  {   
       
        if (isEmpty()) {
            throw new NoSuchElementException();  
        } else {
            E temp = queue.head.getData();
            queue.removeHead();
            return temp;
        } 
        
    }
    
    public boolean isEmpty()
    {
          if (queue.size == 0) {
           return true; 
        } else {
            return false;
        }
    }
    
    public int size() {
        return queue.size();
    }
    
    public boolean isFull() {
        return false;
    }
    
    // print front of queue   
    public E front()   
    {   
        if (queue.size() == 0) {   
            throw new NoSuchElementException();    
        }   else { 
            return queue.head.getData();   
        }
    } 
    
    public String toString() {
        Node curNode = queue.head; 
        String result = "";

        for (int i = 0; i < queue.size(); i++) {
            result = result + curNode.getData() + " ";
            curNode = curNode.getNext();
        }
    
        return result;
    }
}   
