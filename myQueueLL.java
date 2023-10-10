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
     * Add element to the back of the queue
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

    /*
     * shows if the queue is empty or not
     * 
     * @return true if empty 
     */
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }

    /*
     * returns the number of elements in the queue
     * 
     * @return  size of queue
     */
    public int size() {
        return queue.size();
    }
    
     /*
     * returns element at front of queue
     * 
     * @return  front of queue
     */
    public E front()   
    {   
         return queue.getHead();
    } 

    /*
     * Returns the queue from front to back
     * 
     * @return  toString
     */
    public String toString() {
        return queue.toString();
        }
    
        return result;
    }
}   
