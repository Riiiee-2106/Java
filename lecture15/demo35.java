package lecture15;

public class demo35 {

    public /*static means class specific method*/static void main(String[] args) {

        Random r1 = new Random();
        System.out.println(r1.PI);


        //4. if we make a final variable in main - declaration and definition together
        final int x = 4;
        System.out.println(x);


        //5.but can we provide declaration and definition of final variable seperately
        final int x1 ;
        x1 = 4;
      //6.  x1=5; //if we try to assign again the value then it will throw error
        
    }
    
}


class Random{

    //1. this is allowed to directly pass value to final variable
    //final double PI = 3.14;

    //2. you can declare a final variable 
    final double PI;

    //7. we can also make static final variables
    static final double PI_VALUE;
    //9. or either provide value here only
    //  static final double PI_VALUE = 3.14;

    


    //3. and then assign its value inside a constructor
    Random(){
        this.PI = 3.14;
    }


    //8. static block - can assign value to static final variable
    static {
        PI_VALUE = 3.14;
    }
}


/*why main is static?
because we don't make object of main
otherwise - 
demo35 d1 = new demo35();
d1.main();  - we had to do this if main is  not static


with static - we can simply call it by classname
demo35.main()


main is a static method which can call all static methods

*/


