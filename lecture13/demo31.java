package  lecture13;

public class demo31 {

    public static void main(String[] args) {
        Student s1 = new Student();
      
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);
    }
    
}



class Student{
    String name;
    int age;
    int rollNumber;
    String college;


    //constructor chaining

    Student(){
        //first statement should be this keyword in constructor
        this("unknown");
        System.out.println("first constructor");

    }

    Student(String name){
       
        this(name,0);
        System.out.println("second constructor");

    }

    Student (String name,int age){
        this(name,age,0);
        System.out.println("third constructor");
    }

    Student (String name,int age,int rollNumber){
        this(name,age,rollNumber,"unknown");
        System.out.println("fourth constructor");
    }

    Student (String name,int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
        System.out.println("fifth constructor");
    }

}