package Chapter11;

public class demo17 {


    //functions in java

    public static void main(String[] args) {
        //main is also a function which takes parameter String[]args and also have return type void 

        sayHello();
        greet("richa"); //"richa is an argument"

        //we can either store the value of function called value which is returned or not
        int sum = sum();
        System.out.println("sum is : "+sum);


         //we can either store the value of function called value which is returned or not
        double multiplication = multiply(2, 10);
        System.out.println("multiplication: "+multiplication);
        



        return; //we can also return from main as it is a function

        //all functions needs to be called from main function - as it is the entry point of function .
        
        //all functions to get executed needs to be written in main.

        
    }




    //parameter - can be many 

    //no input no output
    static void sayHello(){
        System.out.println("hello");
        //return - its optional as we are not returning something
    }

    //input but no output

                     //name is paramete
    static void greet(String name){
        System.out.println("hello "+name);
        return; //still optional to write
    }


    //no input but output
    static  int sum(){
        int num1 = 5;
        int num2 = 10;
        return num1+num2;
    }

    //input and output
    static double multiply(int num1,int num2){
        return num1*num2;
    }
    
}
