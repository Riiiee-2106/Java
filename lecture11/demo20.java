public class demo20 {

    public static void main(/*why we take string []args --> will study later*/String[] args) {

        // function overloading

        // we can use same function multiple time
        int x = sum(2,3);
        System.out.println(x);

        int y = sum(5,6);
        System.out.println(y);


        // int z = sum(3,4)+5;  we can make multiple function with different number of parameters
        // but how compiler knows which sum function to call? -> because of number of argument passed  - we can do function overloading
        int z = sum(9,8,7);
        System.out.println(z);

        int m = sum(9.5,6.7);
        System.out.println(m);

        greet("rucha",29);
        greet(29,"richa");

        
    }

//--------------------------------------------------------
// different number of parameter
    static int sum(int a, int b){
        return a+b;
    }

    static int sum(int a,int b,int c){ 
        return a+b+c;
    }


    //----------------------------------------------------

    // datatype of paramater changed
    static int sum(double a,double b){
        return (int)(a+b);
    }

    // --------------------------------------------
    // change the order of parameter
    static void greet(String name,int age){
        System.out.println("hi my name is "+name +",and age is "+age);
    }


    static void greet(int age , String name){
        System.out.println("hi "+name +",your age is "+age);
    }


    //----------------------------------------------------
    // will changing the return type also does function overloading
   
   /*  static int fun(){
        return 5;
    }

    static void fun(){
        System.out.println("fun");
    }


    why this won't work? --> because we may or may not collect the fun data in any variable so when we call both the fun function

    fun()
    fun()  both looks same which means compiler - takes it as duplicate
        */
    
}
