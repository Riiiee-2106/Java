package lecture17;

public class demo50 {

    public static void main(String[] args) {
        //fields and variables can not be polymorphic - means can't be overriden

        A a = new B();
        System.out.println(a.x);

        B b = new B();
        System.out.println(b.x);


    }
    
}


class A{
    int x = 10;

}


class B extends A{
    int x = 20;
}


//final classes can not have child classes