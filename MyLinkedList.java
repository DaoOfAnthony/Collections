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
    private Node<E> tail;
    private int size;

    /**
     * Constructor for objects of class MyLinkedList
     */
    public MyLinkedList() {
        head = tail = null;
        size = 0;
    }

    //@param data stored in LinkedList
    public void addHead(E data) {
        if(head == null) { // empty list 
            head = new Node<E>(data);
            tail = head;
            size++;
        } else { // not empty list
            Node<E> newNode = new Node(data); 
            newNode.setNext(head);
            newNode.getNext().setPrev(newNode);
            head = newNode;
            size++;
        }
        
    }
     /**
     * removes the first element in LinkedList
     */
    public E removeHead()
    {
          if (head == null) {
            throw new NoSuchElementException(); // handles error of empty list
        } else {
            E temp = head.getData();
            head = head.getNext();
            size--;
            return temp;
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
            
            tail.setNext(newNode);
            newNode.setPrev(tail);
            size++;
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
            return false;
        } else {
            return true;
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
     * get node at index
     */
    public E get(int index){
        if (index < 0 || index > size()-1) {
            throw new NoSuchElementException();
        } else {
             Node<E> curNode = head;
            
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
            return curNode.getData();
        }
    }
    
    /**
     * 
     * get node at index
     */
    public E remove(int index) {
         if (index > size() - 1 || index < 0) {
            throw new NoSuchElementException();
        } else if(index == 0) {
            size--;
            return removeHead();
        } else {
            Node<E> currNode = head;
            
            size--;
            for (int i = 0; i < index-1; i++) {
                currNode = currNode.getNext();
            }
            if (index == size() - 1) {
                tail = currNode;
                Node<E> temp = currNode.getNext();
                currNode.setNext(null);
                return temp.getData();
            } else {
                Node<E> temp = currNode.getNext();
                currNode.setNext(currNode.getNext().getNext());
                temp.setNext(null);
                return temp.getData();
            }
        }
    }
    
    /**
     * 
     * going through the Linkelist finding where data = element
     */
    public E remove(E element) {
        Node<E> currNode = head;
        int index = 0;
        
        while (currNode != null && currNode.getData().compareTo(element) != 0) {
            currNode = currNode.getNext();
            index++;
        }
        if (currNode == null) {
            return null;
        }
        size--;
        return remove(index);
    }
    
     /**
     * 
     * add particular element at a specific index
     */
    public void add(int index, E element) {
        if (index < 0 || index > size()) {
            throw new NoSuchElementException();
        } else if (index == 0){
            addHead(element);
        } else {
            Node<E> newNode = new Node(element);
            Node<E> curNode = head;    
            for (int i = 0; i < index - 1; i++) {
                curNode = curNode.getNext();
            }   
                
            curNode.setNext(newNode);
            newNode.setNext(curNode.getNext().getNext());
            newNode.setPrev(curNode); 
            size++;
        } 
    }
    
     /**
     * 
     * adds at bottom 
     */
    public void add(E element) {
        addTail(element);
    }
    
    public void set(int index, E element){
        if (index < 0 || index > size() - 1) {
            throw new NoSuchElementException();
        } else if (index == 0){
            //head.data = element;
        } else {
            Node<E> curNode = head;    
            for (int i = 0; i < index; i++) {
                curNode = curNode.getNext();
            }
                
            //curNode.data = element;
        } 
    }
    
    public void insertSorted(E element) {
        Node<E> currNode = head;
        int index = 0;
        
        while (currNode != null && currNode.getData().compareTo(element) < 0) {
            currNode = currNode.getNext();
            index++;
        }
        add(index, element);
        size++;
        } 
    
    public String toString() {
        String contents = "";
        
        Node<E> currNode = head;
        
        while (currNode.getNext() != null)
        {
            contents += currNode.getData() + ", ";
            currNode = currNode.getNext();
        }
        contents += currNode.getData();
        
        return contents;
    }    
}