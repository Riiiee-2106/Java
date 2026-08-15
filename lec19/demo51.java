package lec19;

public class demo51 {
    

    public static void main(String[] args) {

        // Person p = new Greeting();
        // p.introduce();


        // anonymous class -- same rule as inner class
        // if made inside method = it will act as local class - so here also effective final rule will be applied
        Person p  = new Person() {
            String name = "richa";
            void introduce(){
                System.out.println("hi ! i am a guest "+name);
                sayHello();
            }

            void sayHello(){
                System.out.println("hello!!!! from anonymous ");
            }
        };
        

        p.introduce();
        // p.sayHello();  -- can't call other methods or variables which are not present in person class
        // you can do this by calling them inside person method overrided

        Person p2 = new Person();
        p2.introduce();
    }
}


class Person{

    void introduce(){
        System.out.println("hello ! i am a person");

    }
}


// class Greeting extends Person{
//     @Override
//     void introduce(){
//         System.out.println("hello,i am a guest");
//     }


    // but what if i want to print guest once only  --- in that case we use anonymous classes



    // can't make constructors --- as anonymous class dont have class name
    // and constructor is same name as class 



    // use
    // static nested class
    // inner class
    // anonymous class -- now replaced by lambdas
    // local class