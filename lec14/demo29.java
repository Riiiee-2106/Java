package lec14;

// call by reference ---> no
// it is call by value

public class demo29 {

    public static void main(String[] args) {
        Random r1  = new Random(4,5);
        System.out.println(r1.x+" ,"+r1.y);
        addTen(r1);
        // why we have a change in x and y here? 
        System.out.println(r1.x+", "+r1.y); 


        Random r2 = r1;
        Random r3 = new Random(r1);
    }


    static void addTen(Random r){
        // functions can take primitives as well as non primitives in parameter
        // infact 

        // static Random addTen(Random r){
        // it can also return an object
        // }


        r.x = r.x+10;
        r.y = r.y+10;
    }
    
}


class Random{
    int x;
    int y;

    Random(int x, int y ){
        this.x = x;
        this.y = y;
    }

    // Random(Random r){
    // this.x = r.x;
    // this.y = r.y; -->construtor which take same type of object as an argument and associate itself with it
    // }


    Random (Random r){
        this.x = r.x;
        this.y = r.y;
    }
}


