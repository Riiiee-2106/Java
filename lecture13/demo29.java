package lecture13;

public class demo29 {

    public static void main(String[] args) {

        //the values which are not provided - have default values
        Student s1 = new Student();
        Student s2 = new Student("richa");
        Student s3 = new Student("adi",19);
        Student s4 = new Student("aditya",21,101);
        Student s5 = new Student("mohan",22,102,"iitg");
        
    }
    
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;


    //constructor overloading

    Student(){

    }

    Student(String name){
        //warning
        // name = name; 

        this.name = name;

    }

    Student (String name,int age){
        this.name = name;
        this.age = age;
    }

    Student (String name,int age,int rollNumber){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    Student (String name,int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    void markAttendance(){
        System.out.println("Attendance marked for student "+name);
    }
}