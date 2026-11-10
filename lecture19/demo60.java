public class demo60 {

    public static void main(String[] args) {
       

        Person p = new Guest();
        p.introduce();



        //anonymous class
        Person p2 = new Person(){
            //we can define a use case  - to print hi! i am a guest once
            String name = "richa";
            void introduce(){
                System.out.println(name);//we can use different fields not present in person class via its defined fields or within its defined fields
                System.out.println("hi! i am a guest");
            }
        };

        p2.introduce(); //this will print - hi! i am a guest , only the time you call introduce
        // System.out.println(p2.name); - so we can not access any field which is not a part of class person

        //we can't make constructor of anonymous classes - as it is unnamed
    }
    
}

class Person{
    void introduce(){
        System.out.println("hi! i am a person");
    }
}


//but i want to print hi! i am a guest only once
class Guest extends Person{
    @Override 
    void introduce(){
        System.out.println("hi! i am a guest");
    }
}


/* same as inner class 
within method if made anonymous - it will be local anonymous class - have effective final rule

mostly use - 
1. static nested class
2.inner class
3.anonymous class -> now switched to lambdas
4.local class*/