package Chapter22;
import java.util.Objects;
public class demo64{


    public static void main(String[] args) {
       

        Student s1 = new Student("aditya",21);
        Student s2 = new Student("aditya",21);



        //getClass()
        System.out.println(s1.getClass().getName());
        System.out.println(s2.getClass().getName());


        //instanceOf operator --> checks if an object is an instance of a class or any of its subclass

        System.out.println(s1 instanceof Student); //true 
        System.out.println(s1 instanceof Object); //true


        Animal a = new Animal();
        Animal d  = new Dog();


        //at runtime which class it points to -  
        System.out.println(a.getClass().getName()); //Animal
        System.out.println(d.getClass().getName()); //Dog


        
         System.out.println(a instanceof Animal); //true 
        System.out.println(d instanceof Animal);//true
        System.out.println(a instanceof Dog); //false
    }

    
}



class Student{

    String name;
    int age;


    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

   
}


class Animal{

    void eat(){

    }
}


class Dog extends  Animal{

    void sound(){

    }
}