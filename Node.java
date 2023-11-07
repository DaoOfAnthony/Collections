/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<E>
{
    E data;  
    Node<E> next;  
    
    //constructor 
    public Node(E data) {  
        this.data = data;  
        this.next = null;  
    }  
    
    //get next
    public Node<E> getNext()
    {
        return next;
    }
    
    //get data
    public E getData()
    {
        return data;
    }
    
    //sets next
    public void setNext(Node<E> newNext) {
        next = newNext;
    }
}
