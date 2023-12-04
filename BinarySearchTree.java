
/**
 * Implementation of Binary Search Tree
 *
 * @author Anthony
 * @version V1
 */
public class  BinarySearchTree<E extends Comparable<E>>
{
    private BinarySearchTreeNode<E> root; 
    private int size;
    
      /**
     * Constructor for class BinarySearchTree
     */
    public BinarySearchTree() {
        root = null;
        size = 0;
    }
    
    /**
     * Inserts element into the binary search tree
     *
     * @param  element that's being inserted
    */
    public void insert(E element){
        if(root == null) {
            root = new BinarySearchTreeNode<E>(element);
        } else {
            root.insert(element);
        }
        size++;
    }
    
     /**
     * searching through tree till match found then return
     * 
     * @param element that's being searched/matched
     * 
     * @return matching element
     */
    public E search(E element) {
        if (isEmpty()) {
            return null;
        } else {
            return root.search(element);
        }
    }
    
     /**
     * Returns the number of elements in the binary search tree
     * 
     * @return the size of the binary search tree
     */
    public int size() {
        return size;
    }
    
     /**
     * Returns true if BST empty, false if not 
     * 
     * @return false/true 
     */
    public boolean isEmpty() {
        if (size != 0) {
            return false;
        } else {
            return true;
        }
    }
    
      /**
     * Returns the minimum element in the binary serch tree
     * 
     * @return min element in the BST
     */
    public E getMin() {
        if (isEmpty()) {
            return null;
        } else {
            return getMin();
        }
    }
    
    /**
     * Return the maximun element in the binary search tree
     * 
     * @return max element in the BST
     */
     public E getMax() {
        if (size == 0) {
            return null;
        } else {
            return getMax();
        }
    }
    
    /**
     * Returns the number of levels in the BSt
     * 
     * @return the # of levels in the tree
     */
    public int getDepth() {
        if (isEmpty()) {
            return 0;
        } else {
            return root.getDepth();
        }
    }
    
    /**
    * Prints all of the elements in order smallest to largest
    * 
    * @return  a string of all the elements(smallest - largest)
    */
    public String toString() {
        if (isEmpty()) {
            return "";
        } else {
            return root.toString();
        }
    }
    
    /**
     * Removes and returns the minimum element
     * 
     * @return the minimum element in the tree
     */
    public E removeMin() {
        if(isEmpty()) {
            return null;
        } else {
            E returned = root.getMin();
            root.removeMin();
            return returned;
        }
    }
    
    /**
     * Removes and returns the maximim element
     * 
     * @return the maximum element in the tree
     */
    public E removeMax() {
        if(isEmpty()) {
            return null;
        } else {
            E returned = root.getMax();
            root.removeMax();
            return returned;
        }
    }
    
     /**
     * Removes element and returns the matched result
     * 
     * @param  element being removed
     * 
     * @return element matched
     */
    public E remove(E element) {
        if (search(element) == null) {
            return null;
        } else {
            root = root.remove(element);
            size--;
            return element;
        }
    }
}
