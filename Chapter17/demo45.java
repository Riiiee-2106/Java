package Chapter17;
public class demo45 {


    //private function - dont get overriden

    public static void main(String[] args) {
        A a = new A();
        a.fun2();

    }
    
}



class A{
    private void fun(){  //these two are different fun methods
        System.out.println("A");
    }

    public void fun2(){
        fun();
    }
}


class B extends A{  //as child class cannot override the private methods
    private void fun(){
        System.out.println("B");
    }
}
