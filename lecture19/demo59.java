public class demo59 {


    //local classes
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.greet();

        
    }
    
}


class Outer{
    private int x = 4;
    void greet(){

        int y = 5;
       // y++;
        //local class can be replaced by other code - 
        class Local{

        void sayHello(){
        System.out.println("hello");
        System.out.println(x);
        System.out.println(y); //effective final variable
    }

        void sayHi(){

        }

        void sayTakeCare(){

        }
}

    Local local = new Local();
    local.sayHello();
}

/*Constructor
Method
If
Loop
static block
 */

/*same rule of inner class
2.effective final variable rule
 */
}