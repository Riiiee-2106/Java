package lecture13;

public class demo28 {

    public static void main(String[] args) {
        
        // default constructor called
        Student s1 = new Student();
        System.out.println(s1.name);


        // paramterized constructor called
        Student s2 = new Student("richa",21,101,"iitg");
        System.out.println(s2.name);

    }
    
}


class Student{
    String name;
    int age;
    int rollNumber;
    String college;


    //default constructor - we made because paramterized was made
    Student(){

    }

    //parameterized constructor
    Student(String n,int a,int rN,String clg){
        name = n;
        age = a;
        rollNumber = rN;
        college = clg;

    }

    void markAttendance(){
        System.out.println("attendance marked for student "+name);
    }
}