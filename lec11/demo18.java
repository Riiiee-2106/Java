package lec11;

public class demo18 {

    public static void main(String[] args) {
        // function overloading

        int x = sum(2,3);
        System.out.println(x);

        int y = sum(5,6);
        System.out.println(y);

        int z = sum(2,3,4);
        System.out.println(z);

        System.out.println(sum(3.2,2.3));

        greet("richa", 21);
        greet(20,"utkarsh");



    }



// same function name, but different parameters
    static int sum(int a,int b){
        return a+b;

    }


    static int sum(int a,int b,int c){
        return a+b+c;
    }


// --------------------------------------------------------------------

    // same function name but order of parameter changed
    static void greet(String name,int age){
        System.out.println("my name and age is"+name+" "+age);
    }


     static void greet(int age,String name){
        System.out.println("my name and age is"+name+" "+age);
    }


// --------------------------------------------------------------------
    // same function name but different parameter type
    static int sum(double a,double b){
        return (int)(a+b);
    }

// ----------------------------------------------------------------------

// java cannot distinguish function with return type different - as when function is called , storing the func is optional , so compiler will get confused


    // static void fun(){
    //     System.out.println("having fun");
    // }

    // static int fun(){
    //     return 1;
    // }
    
}
