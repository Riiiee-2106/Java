public class demo68 {
    

    public static void main(String[] args) {
        
        // instanceOf operator => check if an object is instance of a class or any of its subclass

        Student s1 = new Student();
        s1.name  = "richa";
        s1.age = 21;
        System.out.println(s1 instanceof  Object);

        Animal d = new Animal();
        System.out.println(d instanceof Animal); 
        System.out.println(d instanceof Dog); 
        System.out.println(d.getClass().getName()); //runtime object creating
        

    }
}

class Student extends Object{
    String name;
    int age;

}


class Animal{
    String name;
    String typeOfAnimal;
}

class Dog extends Animal{
    String typeOfDog;
}