public class demo22 {

    // global scope --> can be accessed anywhere in the class 

   /*will discuss static later*/  
   static String name = "richa";

    public static void main(String[] args) {
        
        // scope of a variables


        // local scope
        int x = 4;
        int y = 5;
        System.out.println(x+" , "+y);


        if(x==4){
            int j = 7; // accessible inside the curly braces of if --> local scope
        }

        //can't access j here
    }
    

    static void func(/*if i grasp those variable in function parameter then only we can access main function variables */ int x, int y){
       /*  System.out.println(x+" , "+y); we cannot access main function variables in this function - those variable have local scope (scope  visibility is in main only*/

       System.out.println(x+" , "+y);


    }


}
