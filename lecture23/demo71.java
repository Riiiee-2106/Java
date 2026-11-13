package lecture23;

public class demo71 {

    public static void main(String[] args) {
        Direction d = Direction.NORTH;
        d.move();
        
    }
    
}


enum Direction{
    NORTH{
        @Override
        public void move(){
            System.out.println("y+1");
        }
        
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("y-1");
        }
        
    },
    
    EAST{
        @Override
        public void move(){
            System.out.println("x+1");
        }
        
    },
    
    WEST{
        @Override
        public void move(){
            System.out.println("x-1");
        }
        
    };

    public abstract void move();





    /*
    class Direction{
        public abstract  void move();
    }

    class NorthDirection extends Direction{
        @Override
        public void move(){
            System.out.println("y+1");
        }
    }

     class SouthDirection extends Direction{
        @Override
        public void move(){
            System.out.println("y-1");
        }
    }

    class EASTDIRECTION extends Direction{
        @Override
        public void move(){
            System.out.println("x+1");
        }
    }

    class WESTDIRECTION extends Direction{
        @Override
        public void move(){
            System.out.println("x-1");
        }
    }


    */

    

}