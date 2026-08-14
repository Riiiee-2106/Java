package lec13;

public class demo26 {
    
  
    // this keyword

    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student("rishi");
        Student s3 = new Student("richa",21);
        Student s4 = new Student("adi",22,101);
        Student s5 = new Student("raghav",21,104,"iitg");
         

    }
    
}


class Student{
    String name;
    int age;
    int rollNo;
    String college;


    // constructor overload  --- constructor chaining using this keyword


    // all above constructors are calling last constructor
    Student(){
        this.name = "undefined";
        this.age = 0;
        this.rollNo = 0;
        this.college = "undefined";

    }


    Student(String name){

        // name = name;  will give warning
        this(name,0,0,"undefined");

    }

    Student(String name,int age){
        this(name,age,0,"undefined");
    }

    Student(String name,int age,int rollNo){
        this(name,age,rollNo,"undefined");
    }


    Student(String name,int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
        
    }
}

