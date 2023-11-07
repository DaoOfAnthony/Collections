import java.util.NoSuchElementException;

class myQueue<E> {   
      
    private int front;
    private int back;
    private int size;
    private E queue[];   
     
    myQueue() {   
        front = 0;
        back = 0;   
        size = 0;
        queue = (E[]) new Object[5];   
    }   
     
    // insert an element into the queue  
    public void enqueue(E element)  {   
        // check if the queue is full  
        if (size == back) {   
            System.out.printf("Queue is full");   
            return;   
        }   
       
        else {   
            queue[back] = element;   
            back++;   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    public E dequeue()  {   
       
        if (isEmpty()) {
            throw new NoSuchElementException();  
        } else {
            for (int i = 0; i < back - 1; i++) {
                queue[i] = queue[i + 1];
            }
            return queue[i];
        } 
        
    }
    
    public boolean isEmpty()
    {
          if (size == 0) {
           return true; 
        } else {
            return false;
        }
    }
    
    public int size() {
        return size;
    }
    
    public boolean isFull() {
        if (size == queue.length) {
            return true;
        } else {
            return false;
        }
    }
    
    // print front of queue   
    public E front()   
    {   
        if (size == 0) {   
            throw new NoSuchElementException();    
        }   else { 
            return queue[front];   
        }
    } 
    
    public String toString() {
        String result = "";

        for (int i = 0; i < size; i++) {
            result = result + queue[i].toString() + " ";
        }
    
        return result;
    }
}   
   
   


