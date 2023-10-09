
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
        
        queue.dequeue(5);
        queue.dequeue(300);
        queue.dequeue(200);
        queue.dequeue(5);
        queue.dequeue(5);
        
        System.out.println(queue.isFull()); 
        System.out.println(queue.toString());
    }
}
