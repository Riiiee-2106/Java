package Chapter11;

public class demo18 {

    public static void main(String[] args) {
        //function overloading

        int x = sum(2,3);
        System.out.println(x);

        int y = sum(5,6,7);
        System.out.println(y);

//--------------------------------------------------------------------------------
        int z = sum(4.5,5.6);
        System.out.println(z);

//--------------------------------------------------------------------------------
        sayHello(21, "richa");
        sayHello("yashita", 29);
    }


//--------------------------------------------------------------------------------

    //a function name can be same for function taking different numbers of parameter


    //add two number function name -- sum
    static int sum(int a ,int b){
        return a+b;

    }


    //add three number function name -- sum
    static int sum(int a ,int b,int c){
        return a+b+c;

    }

//----------------------------------------------------------------------------------


//a function with same name but different type of parameter

    static int sum(double a,double b){
      return (int)  (a+b);
    }

 //----------------------------------------------------------------------------   
    
 //we can change the function parameter of same function name  -- change ordering of parameters


    //function name sayHello with parameter = name and then age
        static void sayHello(String name,int age){
            System.out.println("my name is "+name+ " and age is "+age);

        }



      //function name sayHello with parameter = age and then name
        static void sayHello(int age,String name){
            System.out.println("my name is "+name+ " and age is "+age);

        }




        //can we have different return type and same parameter and same function name?


        // function value which is returned to main after getting called is optional to store somewhere - so if you pass int fun or void fun - it cannot classify which fun is being called 

        /* 

        static int fun(){
            return 1;
        }

        static void fun(){
            System.out.println("hello richa");
        }

        */
}
