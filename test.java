
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void testBST() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        System.out.println(bst.getDepth());
        bst.insert(5);
        System.out.println(bst.getDepth());
        System.out.println(bst.size());
        for (int i = 0; i < 10; i++) {
            bst.insert(i);
        }
        System.out.println(bst.toString());
        bst.remove(3);
        System.out.println(bst.toString());
    }

}
