
/**
 * Write a description of class BinarySearchTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class  BinarySearchTree<E extends Comparable<E>>
{
    private BinarySearchTreeNode<E> root; 
    private int size;
    
    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    
    public void insert(E element){
        if(root == null) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
            
        }
        size++;
    }
    
    public E search(E element) {
        if (isEmpty()) {
            return null;
        } else {
            return root.search(element);
        }
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public E searchE(E element) {
        if (root == null) {
            return null;
        } else {
            search(element);
        }
        return element;
    }
    
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else {
            return getMin();
        }
    }
    
     public E getMax() {
        if (size == 0) {
            return null;
        } else {
            return getMax();
        }
    }
    
    public int getDepth() {
        if (isEmpty()) {
            return 0;
        } else {
            return root.getDepth();
        }
    }
    
    public String toString() {
        return toString();
    }
}
