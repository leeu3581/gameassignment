
/**
 * This is the objects class and allows the player to carry objects
 *
 * @sofialee
 * @22/11/17
 */
public class Object
{
    private String description;
    
    private int weight;
    private Room currentRoom;

    
    private boolean carried;
    
    /**
     * Creates an object with description similar to the Room class
     */
    public Object(String description, Room currentRoom, int weight) 
    {
        this.description = description;
        this.currentRoom = currentRoom;
        this.weight = weight;
    }

    /**
     * @return The short description of the object
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }
    
    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     //Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        return "You are " + description ;
    }
    
    public int getWeight(){
        return weight;
    }
    
    public Room getRoom(){
        return currentRoom;
    }
    
    public void carryObject(boolean carried){
        if(carried == true){
            currentRoom = nextroom;
        }
    }
}
