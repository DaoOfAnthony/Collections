
/**
 * Write a description of class testingLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testingLinkedList
{
    public static void test()
    {
        MyLinkedList test = new MyLinkedList();  
     
        test.addHead(10);
        test.addHead(20);
        System.out.println(test.toString());
        test.addTail(80);
        test.add(2,-24);
        test.add(3,42);
        test.removeHead();
        System.out.println(test.toString());
        test.addTail(20);
        System.out.println(test.toString());
        System.out.print(test.isEmpty());
        
    }
}
