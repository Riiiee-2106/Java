package lec13;

public class demo25 {

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


    // constructor overload

    Student(){

    }


    Student(String name){

        // name = name;  will give warning
        this.name = name;

    }

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }


    Student(String name,int age,int rollNo,String college){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.college = college;
        
    }
}