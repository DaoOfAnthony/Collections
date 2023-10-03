
/**
 * Write a description of class testingStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testingStack
{
    public static void test()
    {
        MyStackLL<Integer> stack = new MyStackLL();
        
        System.out.println(stack.isEmpty()); 
        
        stack.push(5);
        stack.push(300);
        stack.push(200);
        stack.push(5);
        stack.push(5);
        
        System.out.println(stack.isFull()); 
        
        System.out.println(stack.toString());
    }
}
