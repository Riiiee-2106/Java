package Chapter23;

public class demo69 {

    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        d.move();
        
    }
    
}



enum Direction{
    NORTH(){
        @Override 
        public  void move(){
            System.out.println("move up y+1");
        }

    },
    SOUTH(){
         @Override 
        public  void move(){
            System.out.println("move down y-1");
        }
    },
    EAST(){
         @Override 
        public  void move(){
            System.out.println("move right x+1");
        }
    },
    WEST(){
       
         @Override 
        public  void move(){
            System.out.println("move left x-1");
        }

    };


    public abstract void move();  //so that you override it by every enum


}


/* 
abstract class Direction{
    public abstract void move();

 
}


class North extends Direction{
    @Override 
    public void move(){
        System.out.println("move up y+1");
    }
}

class South extends Direction{
    @Override 
    public void move(){
        System.out.println("move down y-1");
    }
}

class East extends Direction{
    @Override 
    public void move(){
        System.out.println("move  right x+1");
    }
}

class West extends Direction{
    @Override 
    public void move(){
        System.out.println("move left x-1");
    }
}

*/

