package Chapter22;
import java.util.Objects;

public class demo65{


    public static void main(String[] args)throws CloneNotSupportedException {
    
    Student s1 = new Student("aditya",21);
    Student s3 = (Student) s1.clone();

    System.out.println(s3.name);

        
    }


   
}

class Student extends Object implements Cloneable{

    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        this.age = age;
    }


    
    protected Object clone()throws CloneNotSupportedException{

    return super.clone();



}

}


