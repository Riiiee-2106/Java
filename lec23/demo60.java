package lec23;

public class demo60 {

    public static void main(String[] args) {
        // values
        // valueOf 
        // both are compiler generated


        // name()
        // ordinal()
        // enum class generated


        // 1.values ---> gives array of values

        Direction [] d = Direction.values();

        for(Direction dir :d){
            System.out.println(dir); //dir.toString -->from inside

            // 3.name
            System.out.println(dir.name());  //diff between toString and name --- name cannot be overriden
        }


        // 3.valueOf --- convert a string to enum -- but case sensitive

        Direction d2 = Direction.valueOf("NORTH"); //if not case sensitive --IllegalArgumentException
        d2.name();



        // ordinal
        System.out.println(Direction.NORTH.ordinal());

    }
    
}



enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST;
}

