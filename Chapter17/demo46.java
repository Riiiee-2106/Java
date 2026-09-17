package Chapter17;
public class demo46 {
    

    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.x);

        C c = new D();
        System.out.println(c.fun());
    }
}



//variables cannot override

class A{

    int x = 10;
    static void fun(){
        System.out.println("hello");
    }
}


class B extends A{

    int x = 20;

}



//we can override variables through the method use'
class C{
    int fun(){
        int x = 20;
        return x;
    }
}

class D extends C{
    int fun(){
        int x = 100;
        return x;
    }
}