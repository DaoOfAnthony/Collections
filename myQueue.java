class myQueue<E> {   
      
    private int front;
    private int back;
    private int capacity;
    private int queue[];   
     
    myQueue(int size) {   
        front = 0;
        back = 0;   
        capacity = size;   
        queue = (E[]) new Object[5];   
    }   
     
    // insert an element into the queue  
    public void enqueue(int element)  {   
        // check if the queue is full  
        if (capacity == back) {   
            System.out.printf("Queue is full");   
            return;   
        }   
     
        // insert element at the back   
        else {   
            queue[back] = element;   
            back++;   
        }   
        return;   
    }   
     
    //remove an element from the queue  
    public void dequeue()  {   
         
        if (front == back) {   
            System.out.printf("Queue is empty");   
            return;   
        }   
     
        // shift elements to the right by one place uptil back   
        else {   
            for (int i = 0; i < back - 1; i++) {   
                queue[i] = queue[i + 1];   
            }   
        }
            
        if (back < capacity) {   
                queue[back] = 0;   
     
            // decrement back   
            back--;   
        }   
        
        return;   
    }      
     
    // print front of queue   
    public void front()   
    {   
        if (front == back) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        System.out.printf("\nFront Element of the queue: %d", queue[front]);   
        return;   
    }   
}   
   


