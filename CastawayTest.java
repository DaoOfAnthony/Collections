
/**
 * Write a description of class CastawayTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CastawayTest
{
        public static void test() {
        String[] lastName = {"",
                                    "Grumby",
                                    "Howell",
                                    "Howell",
                                    "Grant",
                                    "Hinkley",
                                    "Summers"};
        String[] firstName = {"Gilligan",
                                    "Jonas",
                                    "Thurston",
                                    "Lovey",
                                    "Ginger",
                                    "Roy",
                                    "Mary Ann"};
        int[] score = {72, 85, 82, 96, 90, 96, 88};
        String[] gender = {"M", "M", "M", "F", "F", "M", "F"};
        
        MyLinkedList<Castaway> castaways = new MyLinkedList<Castaway>();
        for(int i = 0; i < lastName.length; i++) {
            Castaway cast = new Castaway(lastName[i], firstName[i], score[i]
                    , gender[i]);
            castaways.insertSorted(cast);
        }
    }
}
