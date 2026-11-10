public class demo53 {

    public static void main(String[] args) {
        
        //where does autoxing and unboxing comes in use - 

        //1.Assignments
         int x = 10;
         Integer y = x;

         //method call
         printInteger(y);

         //Arithmetic operations
         Integer a = 10;
         Integer b = 20;
         int sum = a+b;
         System.out.println(sum);



         //wrapper classes can store null but not primitives
         Integer x1 = null;
        //  int y1 = x1;
        //  System.out.println(y); //will give nullpointerexception at runtime

    }


    static void printInteger(int x){
        System.out.println(x);
    }
    
}


