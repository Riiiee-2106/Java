package lec16.more_about_packages.college;

public class Student {

    void print(){ //print method is not accessible as it is default - default methods can be accesed in same package
        System.out.println("college student");
    }
    
}

// so if i have a class teacher here - we can access print method

class Teacher{
 void print(){
    Student s1 = new Student();
    s1.print();
 }
}
