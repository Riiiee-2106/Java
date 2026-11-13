public class demo76{
    public static void main(String[] args) {
        
           //supports multiple inheritance


    }
}

/*class A{

}

class B{

}

class C extends A,B{ -- not supported via class but via interfaces

}*/

interface A{
    void fun();

}

interface B{
void fun2();
}

class C implements A,B{
    @Override
   public  void fun(){

    }

    @Override
    public void fun2(){

    }

}


interface Animal{
    void eat();
}

interface Dog extends Animal{ //one interface extends other interface
void bark();

}


class StreetDog implements Dog{

public void eat(){
    System.out.println("street dog eats");
}

@Override
public void bark(){
    System.out.println("street dog is barking");
}

}
