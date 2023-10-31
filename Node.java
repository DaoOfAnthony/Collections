
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
    
    public Node(E data) {  
        this.data = data;  
        this.next = null;  
    }  
    
    public Node<E> getNext()
    {
        return next;
    }
    
    public E getData()
    {
        return data;
    }
    
    public void setNext(Node<E> newNext) {
        next = newNext;
    }
}
