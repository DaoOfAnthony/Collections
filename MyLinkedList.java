import java.util.NoSuchElementException;

 /**
 * Creates a LinkedList
 *
 * @author Anthony
 */
public class MyLinkedList<E extends Comparable<E>>
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
    
    /**
     * 
     * 
     */
    public E get(int index){
        if (index < 0 || index > size()-1) {
            Node<E> curNode = head;
            
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
            return curNode.getData();
            
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public E remove(int index) {
        if (index < 0 || index > size()-1) {
            Node<E> curNode = head;
            
            if(index == 0){
                removeHead();
            }
            
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.getNext();
            }
            curNode.next = curNode.getNext().getNext();
            return curNode.getData();
            size--;
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public void add(int index, E element) {
        if (index < 0 || index > size() - 1) {
            throw new NoSuchElementException();
        } else if (index == 0){
            addHead(element);
        } else {
            Node<E> newNode = new Node(element);
            Node<E> curNode = head;    
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.getNext();
            }   
                
            curNode.next = newNode; 
            newNode.next = curNode.getNext().getNext();
            size++;
        } 
    }
    
    public void add(E element) {
        addTail(element);
    }
    
    public void set(int index, E element){
        if (index < 0 || index > size() - 1) {
            throw new NoSuchElementException();
        } else if (index == 0){
            head.data = element;
        } else {
            Node<E> curNode = head;    
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
                
            curNode.data = element;
        } 
    }
    
    public void insertSorted(E element) {
        Node<E> curNode = head;
        int count = 0;
        while(curNode.getData() < element){
            curNode = curNode.getNext();
            count++;
            if (count == size) {
                curNode.data = element;
            }
        }
                
        curNode.data = element;
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