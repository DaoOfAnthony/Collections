
/**
 * Write a description of class testingqueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testingqueue
{
   public static void test()
    {
        myQueueLL<Integer> queue = new myQueueLL();
        
        System.out.println(queue.isEmpty()); 
        
        queue.enqueue(5);
        queue.enqueue(300);
        queue.enqueue(200);
        queue.enqueue(5);
        queue.enqueue(5);
        
        System.out.println(queue.isFull()); 
        System.out.println(queue.toString());
    }
}
