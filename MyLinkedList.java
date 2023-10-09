import java.util.NoSuchElementException;

public class MyLinkedList<E>
{
    /*Linked list - points to the first node
     * has Node head
     * 
     * 2 classes
     * 
     * box > box > box - each box/node is a object
     * 
     * 2 instance variables - int data/ node next - if no next node, = null
     * 
     *
     */
    
    Node<E> head;
    int size;
    
    public MyLinkedList() {
        head = null;
        size = 0;
    }
    
    public void addHead(E data) {

        if(head == null) {  
            head = new Node<E>(data);
            size++;
        } else {
            Node<E> newNode = new Node(data); 
            newNode.next = head;
            head = newNode;
            size++;
        }
    }
    
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
    
    public boolean isEmpty() {
        if (size != 0)
        {
            return true;
        } else {
            return false;
        }
    }
    
    public int size() {
      return size;
    }  
    
    public String toString() {
        Node curNode = head; 
        String result = "";

        while (curNode != null) {
            result = result + curNode.getData() + " ";
            curNode = curNode.getNext();
        }

        return result;
    }
    
    
}
