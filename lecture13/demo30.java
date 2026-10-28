package lecture13;

public class demo30 {

    public static void main(String[] args) {
        Student s1 = new Student("richa");
        System.out.println(s1.age); //0
        
    }
    
}



class Student{
    String name;
    int age;
    int rollNumber;
    String college;


    //constructor chaining

    Student(){

        //instead of passing string as null we passed unknown - nullpointer exception is something we will study later
       
        this("unknown",0,0,"unknown");

    }

    Student(String name){
       
        this(name,0,0,"unknown");

    }

    Student (String name,int age){
        this(name,age,0,"unknown");
    }

    Student (String name,int age,int rollNumber){
        this(name,age,rollNumber,"unknown");
    }

    Student (String name,int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }
}