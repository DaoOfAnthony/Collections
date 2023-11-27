
/**
 * Write a description of class BinarySearchTreeNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearchTreeNode<E extends Comparable <E>>
{
    // instance variables
    private BinarySearchTreeNode<E> left;
    private BinarySearchTreeNode<E> right; 
    private E data; 
    
    public BinarySearchTreeNode(E data)
    {
        left = null; 
        right = null;
        this.data = data;
    }
    
    public E getData()
    {
        return data;
    }
    
    public void setData(E newData)
    {
        data = newData;
    }
    
    public BinarySearchTreeNode<E> getRight()
    {
        return right;
    }
    
    public  BinarySearchTreeNode<E> setRight(BinarySearchTreeNode<E> newRight)
    {
        return right = newRight;
    }
    
     public  BinarySearchTreeNode<E> getLeft()
    {
        return left;
    }
    
    public BinarySearchTreeNode setLeft( BinarySearchTreeNode<E> newLeft)
    {
        return left = newLeft;
    }
    
    public void insert(E element) {
        if (element.compareTo(data) < 0){
            if (left == null){
                left = new BinarySearchTreeNode(element); 
                
            } else {
                left.insert(element);
            }
        } else {
            if (right == null) {
                right = new BinarySearchTreeNode(element); 
            } else {
                right.insert(element);
            }
        }
    }
    
    public E search(E element) {
        if (data.compareTo(element) == 0) {
            return element;
        } else if (element.compareTo(this.data) < 0) {
            if (left == null) {
                return null;
            } else {
                return left.search(element);
            }
        } else {
            if (right == null) {
                return null;
            } else {
                return right.search(element);
            }
        }
    }
    
    public E getMin() {
        if(left == null) {
            return data;
        } else {
            return left.getMin();
        }
    }
    
    public E getMax() {
        if(right == null) {
            return data;
        } else {
            return right.getMax();
        }
    }
    
    public int getDepth() {
        if(left  == null && right == null) {
            return 0; 
        } else if (left == null) {
            return right.getDepth() + 1;
        } else if (right == null) {
            return left.getDepth() + 1;
        } else {
            if (left.getDepth() >= right.getDepth()) {
                return left.getDepth() + 1;
            } else {
                return right.getDepth() + 1;
            }
        }
    }
    
    public String toString() {
        String result = "";
        
        if (left != null) {
            result = left.toString() + ", ";
        } 
        result = result + data.toString();
        
        if (right != null) {
            result = result + ", " + right.toString();
        }
        return result;
    }
    
    public E remove(E element) {
        
    }
}
