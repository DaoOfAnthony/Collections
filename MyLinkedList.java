import java.util.NoSuchElementException;

 /**
 * Creates a LinkedList
 *
 * @author Anthony
 */
public class MyLinkedList<E>
{
    //instance variables
    private Node<E> head;
    private int size;
    private Node<E> tail;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    //@param data stored in LinkedList
    public void addHead(E data) {

        if(head == null) {  
            head = new Node<E>(data);
            size++;
            
            if(size == 1) {
                tail = new Node<E>(data);
            }
        
        } else {
            Node<E> newNode = new Node(data); 
            newNode.next = head;
            head = newNode;
            size++;
            
            if(size == 1) {
                tail = new Node<E>(data);
            }
        }
        
    }
     /**
     * removes the first element in LinkedList
     */
    public Node<E> removeHead()
    {
        if (head == null)
        {
            throw new NoSuchElementException();
        } else {
            Node<E> replace = head;
            head = head.next;
            return head;  
        }
    }
 
     /**
     * Adds an element to the back of the linked list
     */
    public void addTail(E data) {
        if (head == null) {
            addHead(data);
        } else {
            Node<E> newNode = new Node(data);
            Node<E> currentNode = head;
        
            while(newNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }

            currentNode = newNode;
        }
    }
 
    /**
     * checks if the LinkedList is empty 
     * 
     * @return if LinkedList empty
     */
    public boolean isEmpty() {
        if (size != 0)
        {
            return true;
        } else {
            return false;
        }
    }

    /**
     * returns number of elements in LinkedList
     * 
     * @return size of LinkedList
     */
    public int size() {
      return size;
    }  
    
    public E get(int index){
            for (int i = 0; i <= index; i++) {
                
            }
    }
    
    
    public String toString() {
        Node curNode = head; 
        String result = "";

        while (curNode.getNext() != null) {
            result = result + curNode.getData() + " ";
            curNode = curNode.getNext();
        }
        result = result + curNode.getData();
     
        return result;
    }
    
    
}