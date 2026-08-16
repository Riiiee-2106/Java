public class demo62 {
    

    public static void main(String[] args) {
        // variables inside interfaces

        Random r1 = new Random();
        r1.fun();

        // MathConstant r2 = new Random();
        // r2.fun(); -- as mathconstant dont have its own fun method we cant call it by parent class ref
    }
}


interface MathConstant{
    double PI_VALUE = 3.14;  //interface joins public static final in variables
    // interfaces cant have constant which is nonstatic and not final

    int Value = 10;

    void fun();

}


class Random implements MathConstant{
    @Override
    public void fun(){
       System.out.println( PI_VALUE);
    }
}


// so if i want to declare only static final variables we will make interface -- so that we can call it by interface.mathemetical constant


