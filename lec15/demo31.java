package lec15;

public class demo31 {

    public static void main(String[] args) {
        Random r1 = new Random();
        System.out.println(r1.PI);



        final int x ; //we can declare once
        x = 5; //and then define separately once 

        // x=6; if tried again it will give error
     

        
    }
    
}


class Random{
    // final double PI ; we can either declare and define together or....


    // what if a variable is static and final
    static final double PI;



    // cant pass static final variable in constructor
     // Random(){
    //     PI = 3.14; // we can define separately once
    // }



    // we need to either assign PI where it is defined or within static block

    static{
        PI = 3.14;
    }
}


