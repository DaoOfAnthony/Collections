
/**
 * castaways object with interace methods
 *
 * @author Anthony
 * @version V1
 */
public class Castaway implements Comparable<Castaway> {
    private String lastName;
    private String firstName;
    private int score;
    private String gender;

    /**
     * Constructor for objects of class Castaways
     * 
     * @param  lastName  the last name of the castaway
     * @param  firstName  the first name of the castaway
     * @param  score  the score of the castaway
     * @param  gender  the gender of the castaway
     */
    public Castaway(String lastName, String firstName, int score
            , String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
        this.gender = gender;
    }

    /**
     * compares the names last name, first name lexicographically
     *
     * @param  other  the castaway to compare
     * @return        0 if they are the same and the difference between 
     * letters if they are different
     */
    @Override
    public int compareTo(Castaway other) {
        
        if(lastName.compareTo(other.lastName) != 0){
            return lastName.compareTo(other.lastName);
        } else if(firstName.compareTo(other.firstName)!=0) {
            return firstName.compareTo(other.firstName);
        } else {
            return 0;
        }
    }
    
    /**
     * compares 2 castaway objects by element.
     * 
     * @param other the castaway to compare
     */
    @Override
    public boolean equals(Object other) {
        return (this.compareTo((Castaway) other) == 0);
    }
    
    /**
     * returns a string of the last name, first name, score, and gender
     */
    public String toString() {
        return lastName + " " + firstName + " " + score + " " + gender;
    }
}