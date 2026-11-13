public class demo75{
    public static void main(String[] args) {
        
        //1.variables inside interfaces
        Random r1 = new Random();
        r1.fun();

        /*MathConstant r2 = new Random();
        r2.fun(); //MathConstant or parent class can call only its variable methods not of child class or inherited class*/
    }
}


interface MathConstant{
    double PI_VALUE  = 3.14; //by default interface variables are final static which is why we kept it uppercase seperated by _

    //interfcae can be made for variables where i want it to be public static final - only constant variables ,
   /* so it can be called as - IntefaceName.variable */





}

class Random implements MathConstant{
    void fun(){
        System.out.println(PI_VALUE);//WE CAN ACCESS PIVALUE BUT NOT CHANGE IT
    }
}