package lec19;

public class demo50 {
    

    // best used rule - effective final variable in local class
}


class Outer{


    void greet(){
        int y = 4;
        // y++; needs to be either final or no modification = it should be effective final
       
        class Local{
            void sayHello(){
                System.out.println(y);
            }

        }

        Local l = new Local();
        l.sayHello();
    }
}