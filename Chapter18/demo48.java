package Chapter18;

public class demo48 {
    


    public static void main(String[] args) {
        

    //Autoxing
//example of assignment operation
    int x = 10;
    Integer x1 = x;  //autoboxing


    System.out.println(x1);  //unboxing ---> x1.intValue() 


    //unboxing
    Integer y = 10;
    int y1 = y;


   //-----------------------------------------------

   //autoboxing
   int z = 10;
   Integer z1 = new Integer(z); //not recommended as it is getting depreciated


   //autoboxing
   int z2 = 100;
   Integer z3 = Integer.valueOf(z2);


   //--------------------------------------------------------------
   //unboxing
   Integer z4 = 100;
   int z5 = z4.intValue();


   //----------------------------------------------------------------


   //non primitives can store null value
   Integer n6 = null;
   //but primitives can not store null value
   //so when you try to store null value in primitive or you assign a null storing non primitive in primitive it will give nullpointer exception
//    int n7 = n6;
//    System.out.println(n7); -- null pointer exception


   //-------------------------------------------------------------------


   /*what are the conditions in which autoboxing and unboxing get applied-
   1.assignment
   2.arithmetic operations
   3.method call*/



   //2.eg -  arithmetic operation
   Integer n1 = 10;
   int n2 = 100;
   System.out.println(n1+n2); //n1.intValue()  , n2



   //3. eg - methods call

   int n3 = 100;
   Integer n4 = 10;

function(n4, n3);



    }
   static void function(int n3,Integer n4){ //n4.intValue, Integer.valueOf(n3)
    System.out.println(n3+" "+n4);  //n3 , n4.intValue()
   }
   
}

/*Integer -> int   == value.intValue() 
  int -> Integer  == Integer.valueOf(value)
*/

