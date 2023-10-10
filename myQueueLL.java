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
     
    /**
     * Add element to back of queue
     */  
    public void enqueue(E element)  {   
        queue.addTail(element); 
    }   
     
    //remove an element from front of queue  
    public E dequeue()  {   
        E temp = queue.getHead();
    
        queue.removeHead();
        return temp;
        } 
        
    }
    
    public boolean isEmpty()
    {
        return queue.isEmpty();
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
