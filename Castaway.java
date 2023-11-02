
/**
 * Write a description of class Castaways here.
 *
 * @author Anthony
 */
public class Castaway<E extends Comparable<E>> {
    private int score;
    private String gender;
    private String lastName;
    private String firstName;
   

    /**
     * Constructor for objects of class Castaways
     *
     * @param  the last name of the castaway
     * @param  the first name of the castaway
     * @param  the score of the castaway
     * @param  the gender of the castaway
     */
    public Castaway(String lastName, String firstName, int score
            , String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
        this.gender = gender;
    }

    /**
     * @param castaway being compared
     * @return 0 if they are the same and the difference between
     * letters if castaway is different
     */
    public int compareTo(Castaway other) {
       
        if(lastName.compareTo(other.lastName)!=0){
            return lastName.compareTo(other.lastName);
        } else if(firstName.compareTo(other.firstName)!=0) {
            return firstName.compareTo(other.firstName);
        } else {
            return 0;
        }
    }

    //if compareTo returns 0, return true 
    public boolean equals(Castaway other) {
        if(compareTo(other) != 0){
            return false;
        } else {
            return true;
        }
    }
   
    public String toString() {
        return lastName + " " + firstName + " " + score + " " + gender;
    }
}
