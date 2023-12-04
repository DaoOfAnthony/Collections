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
            
            
            newNode.setPrev(tail);
            newNode.getPrev().setNext(newNode);
            tail = newNode;
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
            return indexHelper(index).getData();
        }
    }
    
    /**
     * 
     * get node at index
     */
    public E remove(int index) {
          if (index >= size() || index < 0) { //  invalid index
            throw new NoSuchElementException();
        } else if (index == 0) {//index at head
            return removeHead();
        } else {
            Node<E> removeNode = indexHelper(index);
            if(index == size - 1) {// index is at end of list
                removeNode.getPrev().setNext(null);
                tail = removeNode.getPrev();
                removeNode.setPrev(null);
                size--;
                return removeNode.getData();
            } else {
                removeNode.getPrev().setNext(removeNode.getNext());
                removeNode.getNext().setPrev(removeNode.getPrev());
                removeNode.setNext(null);
                removeNode.setPrev(null);
                size--;
                return removeNode.getData();
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
        if (currNode == null) { // if empty
            return null;
        }
        
        return remove(index);
    }
    
    private Node<E> indexHelper(int index) {
        if (index < size / 2) {
            Node<E> curNode = head;
            for (int i = 0; i<index; i++) {
                curNode = curNode.getNext();
            }
            return curNode;
        } else {
            Node<E> curNode = tail;
            for (int i = size-1; i>index; i--) {//maybe use size not size-1??
                curNode = curNode.getPrev();
            }
            return curNode;
        }
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
        } else if (index == size) {
            addTail(element);
        } else {
            Node<E> newNode = new Node<E>(element);
            Node<E> curNode = indexHelper(index);
                
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
        if (head == null) {
            addHead(element);
        } else {
            addTail(element);
        }
    }
    
    public void set(int index, E element){
        if (index < 0 || index > size() - 1) {
            throw new NoSuchElementException();
        } else if (index == 0){
            head.setData(element);
        } else { 
            Node<E> curNode = head;
            curNode = indexHelper(index);
            curNode.setData(element);
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