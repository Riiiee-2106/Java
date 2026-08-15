package lec23;

public class demo59 {

    public static void main(String[] args) {

        // PaymentStatus status = PaymentStatus.SUCCESS;

        // System.out.println(status.name());

        // status = 100; //error
        // cant put random values

        // if(status =="success")  all will give compile time error


        Direction d = Direction.NORTH;
        System.out.println(d.getDegree());

        Direction d1 = Direction.SOUTH;
        System.out.println(d1.getDegree());


        Direction2 direct = Direction2.EAST;
        direct.move();


    }
    
}


// enum----enumerations (enumerated types)
// enum -- predefined set of constant


enum PaymentStatus{
    SUCCESS,
    FAILED,
    PENDING;
}

class PaymentStatus2{
    final public static int  SUCCESS = 1;
    final public static int FAILED = 2;
    final public static int PENDING = 3;
}


enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(270);

    private int degree;
    Direction(int degree){
        this.degree = degree;
    }


    int getDegree(){
        return this.degree;
    }
}



enum Direction2{
    

NORTH{
    @Override
    public void move(){
        System.out.println("move up y+1");
    }
},

SOUTH{
    @Override
    public void move(){
        System.out.println("move down y-1");

    }
},
EAST{
    @Override
    public void move(){
        System.out.println("move right x+1");

    }
},
WEST{
    @Override
    public void move(){
        System.out.println("move left x-1");
    }
};

public abstract void move();

}
