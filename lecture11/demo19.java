public class demo19{
    public static void main(String[] args) {
        /*types of functions  */

        greet();
        sayHello("richa");
        int number = getNum();
        System.out.println(number);
        //or System.out.println(getNum());
        double product =  multiply(5,5.5);
        System.out.println(product);

    }

        // no i/p , no o/p
        static void greet(){
            System.out.println("hello");
        }


        //i/p,no o/p
        static void sayHello(String name){ //number of parameter can be anything
            System.out.println("hello "+name);
        }


        //no i/p ,o/p
        static int getNum(){
           return 10;  
        }


        //i/p ,o/p
        static double multiply(int num1,double num2){
            return num1*num2;
        }

    }
