package Chapter23;

public class demo68 {

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
 
    //can use anonymous class

    private  int degree; //not a class variable, its variable of objects 


    Direction(int degree){
        this.degree = degree;
    }


    public int getDegree(){
        return this.degree;
    }
 



}
