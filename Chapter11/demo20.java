package Chapter11;

public class demo20 {

    //scope of variable


    //global scope - variable passed outside of main function 

    //global variable should be static - will discuss later
    int num = 2; //it can be called from any where


    public static void main(String[] args) {
        
    

    //local scope -- in java if you pass a variable within a function it stays till the function --- local scope



  

    int x = 3;
    int y = 5;

    System.out.println(x+" "+y);

    fun();


      //local scope -- in java if you pass a variable till a curly bracket it stays till curly bracket
        {
            int j = 10;
        }


        // System.out.println(j); -- j cannot be called outside the curly bracket it got initialized in




        //local variable have local scope - that is ,until its block executes it stays till then,after the execution of the block  it won't be useful it got destroyed


    }




    static void fun(){

        //these x and y are different from the main function x and y
        int x = 3;
        int y = 10;
        System.out.println(x+y);
    }

    
    
}
