package Chapter23;

public class demo70 {

    public static void main(String[] args) {
        
        Direction [] dir = Direction.values();

        for(Direction d: dir){
            System.out.println(d);  //d.toString(), d.name()
        }

        Direction d  = Direction.valueOf("EAST"); //case sensitive  ,other wise give illegalargumentexception

        // name() - cannot be overriden
        // toString() - can be overriden

        // ordinal() -- number
        System.out.println(d.SOUTH.ordinal());


    }
    
}


// values == we can iterate in the enum

// valueof == convert a string into a respective  enum constant

enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override 
    public String toString(){

        return (this.name()+" direction");
    }
}