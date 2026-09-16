package Chapter15;

import java.util.*;

public class demo33 {

    public static void main(String[] args) {

        //why main function is static 
        // so we dont have to make object of class demo33
        //we can call static main function as - className.functionName()
        //  demo33.main()

        //if main was not static method  then we had to make object of main()
        //demo33 d1 = new demo33()
        //d1.main()


        //thats why static main can only call static methods and not non static methods



        Random r1 = new Random();
        System.out.println(r1.PI);


        final int x;
        x = 4;
        // x=5; only assign once

    } 
    
}


class Random{
    // final double PI = 3.14; either this

    // final double PI ;
    // PI = 3.14; either this


    final double PI;

    Random(){ //if declared final variable in class , can assign value of final in constructor once
        this.PI = 3.14;
    }



    static final double PI_VALUE ; 
    //static final double PI_VALUE = 22/7;//when a variable is static and  final we need to assign it here only , or in static block

    static{
        PI_VALUE = 3.14;  //any  object of random pivalue will be 3.14 only
    }



}