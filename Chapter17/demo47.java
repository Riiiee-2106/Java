package Chapter17;
public class demo47 {
    
    public static void main(String[] args) {
        
    }
}



class A{
    final void fun(){
        System.out.println("fun of A");
    }
}


class B extends A{
    // final void fun(){  -- cannot override a final method
    //     System.out.println("fun of B");
    // }
}