package Chapter14;

public class demo31 {

    // call by reference - there is no call by reference in java ,it seems like it is call by reference but is call by value only


    public static void main(String[] args) {
        Random r1  = new Random(2,3);

        System.out.println(r1.x+" "+r1.y);
        addTen(r1);
        System.out.println(r1.x+" "+r1.y);

        /* Random r2 = new Random (r1); */


        Random r2 = new Random (r1); 





    }
        static void addTen(Random r){
            r.x+=10;
            r.y +=10;
        }


        // return type can be non primitive
        // static Random addTen(Random r){
        //     r.x+=10;
        //     r.y +=10;
        //     return r;
        // }
    
    }

class Random{
    int x;
    int y;

    Random(int x , int y){
        this.x = x;
        this.y = y;
    }



    //*constructor can also take same type of object as in argument and associate with it
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }
}
