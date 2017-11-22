
/**
 * Class Player- the player inside the game
 *
 * @sofialee 
 * @22/11 
 */
public class Player
{
    // instance variables - replace the example below with your own
    private int weight;

    /**
     * Constructor for objects of class Player
     */
    public Player()
    {
        // initialise instance variables
        weight = 0;
    }
    
    /**
     * Sets the new weight of player's pbjects by adding or removing
     * Maximum weight of the total objects held is 20
     */
    private void addWeight(int weightadded)
    {
       if(weight <= 20){
        weight = weight + weightadded;
       }
       else{
        System.out.println("Woops, couldn't pick up the object, its too heavy!");
        }
    }

    private void removeWeight(int weightremoved)
    {
        weight = weight - weightremoved;
        if(weight < 0){
            weight = weight + weightremoved;
            System.out.println("Woops, couldn't drop that object as you cant carry negative objects");;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int pickupObject(int y)
    {
        // put your code here
        return weight + y;
    }
}
