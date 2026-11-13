package lecture23;

public class demo70 {

    public static void main(String[] args) {
        
        Direction d = Direction.NORTH;
        System.out.println(d.getDegree());
    }
    
}


enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);


    private int degree;  //object variable  - non static

    Direction(int degree){
        this.degree = degree;
    }


    public int getDegree(){
        return degree;
    }
}