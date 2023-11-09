
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
        test.addTail(80);
        
        MyLinkedList test2 = new MyLinkedList();
        test2.add(0,-24);
        test2.add(1,42);
        System.out.println("yessir" + test2.toString());
        
        MyLinkedList test1 = new MyLinkedList();  
        test1.insertSorted(20);
        test1.insertSorted(10);
        test1.insertSorted(40);
        test1.insertSorted(30);
        test1.get(2);
        
        
        test.removeHead();
        System.out.println(test.toString());
        test.addTail(20);
        System.out.println(test.toString());
        System.out.print(test.isEmpty());
        
    }
}
