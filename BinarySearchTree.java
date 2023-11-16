
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
    }
    
    public void insert(E element){
        if(root == null) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
            size++; 
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
    
    public E search(E element) {
        if (root == null) {
            return null;
        } else {
            search(element);
        }
        return element;
    }
    
    public E getMin() {
        if (root == null) {
            return null;
        } else {
            search(
        }
    }
    
    public E getMax() {
        if(root == null) {
            return null;
        } else {
            int max = root.data;
            int left = findMax(root.left);
            int right = findMax(root.right);
 
            if (left > cur) {
                max = left;
            } else if (right > cur) {
                max = right;
                return cur;
            }   
        }
    }
}
