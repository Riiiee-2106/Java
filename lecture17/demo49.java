package lecture17;

public class demo49 {


    //can't override final methods
    public static void main(String[] args) {
        
    }
    
}


class A{
    final void fun3(){
        System.out.println("A");
    }
}

class B extends A{

    // void fun3(){
    //     System.out.println("B");
    // }
}
