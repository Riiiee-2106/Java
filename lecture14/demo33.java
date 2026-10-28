package lecture14;

public class demo33 {

    public static void main(String[] args) {

        //understanding call by reference -->there is no call by reference in java
        Random r1 = new Random(4,5);
        System.out.println(r1.x+","+r1.y);
        addTen(r1);
        System.out.println(r1.x+","+r1.y);


        //deep copy
        Random r2 = new Random(r1);
        System.out.println(r2.x+" ,"+r2.y);

        //shallow copy
        Random r3 = r1;
        System.out.println(r3.x+","+r3.y);
        
    }

    //we can take non primitives in parameter of fnxs-
    //in fact return type of fnxs can be non primitives too-
    static void addTen(Random r){
        r.x = r.x+10;
        r.y = r.y+10;
    }
    
}


class Random{
    int x;
    int y;

    Random(int x,int y){
        this.x = x;
        this.y = y;
    }

    //constructors can also take non primitive parameter
    Random(Random r){
        this.x = r.x;
        this.y = r.y;
    }

}