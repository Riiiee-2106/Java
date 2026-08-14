package lec13;

public class demo27 {

//    this keyword
  

    public static void main(String[] args) {
        
        Student s1 = new Student();
        

    }
    
}


class Student{
    String name;
    int age;
    int rollNo;
    String college;


    // constructor overload  --- constructor chaining using this keyword


    
    Student(){
     this.name = "undefined";
        System.out.println("first constructor");
    }


    Student(String name){

        // name = name;  will give warning
        this(name,0);
            System.out.println("second constructor");

    }

    Student(String name,int age){
        this(name,age,0);
            System.out.println("third constructor");
    }

    Student(String name,int age,int rollNo){
        this(name,age,rollNo,"undefined");
            System.out.println("fourth constructor");
    }


    Student(String name,int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
            System.out.println("fifth constructor");
        
    }
}


    
