
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
    
}
