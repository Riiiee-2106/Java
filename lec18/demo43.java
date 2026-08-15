package lec18;

public class demo43 {


    public static void main(String[] args) {

          // where can  autoboxing and unboxing can be used
            // assignment
        // autoboxing

        int x = 10;
        Integer y = x;  //autoxing
        // internally Integer y = Integer.valueOf(x);

        System.out.println(x);
        System.out.println(y);  //--->unboxing
        // internally - y.intValue()


        // unboxing

        Integer i = 10;
        // internally 
        // earlier 
        // Integer i = new Integer(10);
        // now
        // Integer i = Integer.valueOf(10);

        int j = i; 
        //internally -- int j = i.intValue();

        System.out.println(j);
        System.out.println(i);  //unboxing

// -------------------------------------------------------------------

// autoboxing and unboxing can be used in arithmetic operations

Integer x2 = 10;
int y2 = 20;
int sum = x2+y2;

System.out.println(sum);

// ----------------------------------------------------------------------------
Integer n1 = null;
// int n2 = n1;  --->this will give runtime exception --- null pointer exception
// System.out.println(n2);

// ------------------------------------------------------------------------
          
    
    Integer y1 = 50;
    int num1 = 30;

    printInteger(y1);
    printint(num1);
    
    }


    // -----------------------------------------------------

  // autoboxing and unboxing can be used in method calls

    static void printInteger(Integer x){
        System.out.println(x);
    }


    static Integer printint(int y ){
        Integer y1 =  y;
        return  y1;
    }

    
}

