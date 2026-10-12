package Chapter19;

public class demo54 {


    //anonymous class
    public static void main(String[] args) {

        Person p = new Person();
        p.introduce();

        Person p1 = new Guest();
        p1.introduce(); 

        //but what if i want guest introduce to get printed once , not everytime.
        //in that case we use anonymous class


        Person p2 = new Person(){

            //only variable and methods which are defined in person class can be accessed by person p2

            void sayHello(){
                System.out.println("greeting hello");
            }

            int x = 2;
            @Override 
            void introduce(){
                System.out.println("i am a anonymous person");
                System.out.println(x);
                sayHello();

                //other methods or variable can be passed within the person class defined method, otherwise they wont get called by person p2 object
            }
        };

        p2.introduce();


        //anonymous classes - dont have constructors
        // as constructors have same name as class name and anonymous classes dont have a name 


        //anonymous same as inner nestd class rule

        //within method class if anonymous class is made - it will be known as local anonymous class - same rule effective final variable
        
    }
    
}


class Person{
    void introduce(){
        System.out.println("hi i am a person");
    }
}


class Guest extends Person{
    @Override 
    void introduce(){
        System.out.println("hello i am a guest");
    }
}



/* usage more to less--
static nested class
inner class
anonymous class now replaced by lambdas
local class

 */