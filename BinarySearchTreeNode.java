
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
    
     public void insert(E element) {
        if (data.compareTo(element ) > 0) { // left
            if (left == null) {
                left = new BinarySearchTreeNode<E>(element);
            } else {
                left.insert(element);
            }
        } else { // right
            if (right == null) {
                right = new BinarySearchTreeNode<E>(element);
            } else {
                right.insert(element);
            }
        }
    }
    
    public E search(E element) {
        if (element.compareTo(data) < 0) {
            if (left == null) {
                return null;
            } else {
                return left.search(element);
            }
        } else if (element.compareTo(data) > 0) {
            if (right == null) {
                return null;
            } else {
                return right.search(element);
            }
        } else {
            return data;
        }
    }
    
     public int getDepth() {
        if(left  == null && right == null) {
            return 0;
        } else if (left == null) {
            return right.getDepth() + 1;
        } else if (right == null) {
            return left.getDepth() + 1;
        }
        else {
            if (left.getDepth() >= right.getDepth()) {
                return left.getDepth() + 1;
            } else {
                return right.getDepth() + 1;
            }
        }
    }
    
    public BinarySearchTreeNode<E> removeMin() { 
        if(left == null) {
            data = null;
            return null;
        } else {
            left = left.removeMin();
            return this;
        }
    }
    
    public BinarySearchTreeNode<E> removeMax() { // assume tree has values
        if(right == null) {
            data = null;
            return null;
        } else {
            right = right.removeMin();
            return this;
        }
    }
    
     public BinarySearchTreeNode remove(E element) { // assume element is in array
         
        if (element.compareTo(data) < 0) { 
            if (left == null) {
                return this;
            } else {
                left = left.remove(element);
                return this;
            }
        } else if (element.compareTo(data) > 0) { 
            if (right == null) {
                return this;
            } else {
                right = right.remove(element);
                return this;
            }
        } else { // match
            if (left == null && right == null) { 
                data = null;
                return null;
            } else if (right == null) {
                data = null;
                return left;
            } else if (left == null) {
                data = null;
                return right;
            } else {
                data = left.getMax();
                left.removeMax();
                return this;
            }
        }
    }
    
     public String toString() {
        String returned = "";
        
        if (left != null) {
            returned = left.toString() + ", ";
        } 
        
        returned = returned + data.toString();
        
        if (right != null) {
            returned = returned + ", " + right.toString();
        }
        return returned;
    }
}
