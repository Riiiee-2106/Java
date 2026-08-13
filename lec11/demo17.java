package lec11;

public class demo17 {

    public static void main(String[] args) {
        
        // functions in java

        sayHello();
        greet("Richa");
        int add = add();
        double multiply = multiply(2.3, 3.2);
        System.out.println(add);
        System.out.println(multiply);

    }
    

    // no ip ,no op
    static void sayHello(){
        System.out.println("hello ");
        // return  -- optional
    }


    // ip ,no op
     static void greet(String name){ //no of paramater can be anything
        System.out.println("hello "+name);
        // return  -- optional
    }

    // no ip , op
    static int add(){
        int i = 2;
        int j = 3;
        return i+j;
    }


    // ip,op
    static double multiply(double n1,double n2){
        return n1*n2;
    }

}
