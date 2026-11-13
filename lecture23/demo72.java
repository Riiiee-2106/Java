public class demo72{
    public static void main(String[]args){
       Direction[]val =  Direction.values(); //RETURNS AN ARRAY

       for(Direction v:val){
        System.out.println(v.name()); //return value or tostring 
        System.out.println(v.ordinal()); //return number of index of value - not really used
       }


//can convert a string into respected object of enum
    Direction d = Direction.valueOf("EAST"); //CASE SENSITIVE
    System.out.println(d.toString());


    //name vs tostring = tostring can be overridden



//value and valueOf comes from compiler - why ?
/*in notes*/
    

    }
}

enum Direction{ //each class extend Object so all method of Object can be used ,

//enum cannot be extend - becoz it bydefault extend enum class, we can implement interfaces , or override methods etc
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override
    public String toString(){
        return this.name()+" direction";
    }
}