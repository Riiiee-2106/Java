public class demo63 {

    public static void main(String[] args) {

        Animal a = new StreetDog();

    }
    
}


// multiple inheritance

// class A{

// }

// class B{

// }

// class C extends A,B{

// }



interface A{

    void fun();
}

interface B{
    void fun2();
}

class C implements A,B{
    @Override
    public void fun(){

    }


    @Override
    public void fun2(){

    }
}


// Interface inheritance

interface Animal{

    void eat();
}

interface Dog extends Animal{
    void bark();
}

class StreetDog implements Dog{
    @Override
    public void eat(){

    }
    @Override
    public void bark(){

    }
}