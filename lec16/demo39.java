package lec16;

public class demo39 {

    // This demo shows how the super keyword is used in inheritance.
    // The child class can access parent class members and also override behavior.
    public static void main(String[] args) {
        EngineeringStudent eg = new EngineeringStudent("richa", 21, 101, "iitg");

        // Inherited field from the parent class
        System.out.println(eg.name);

        // Child class field
        System.out.println(eg.college);

        // Calls the child class method
        eg.print();

        // Calls the overridden method in the child class
        eg.markAttendance();
        
    }
    
}


class Student{

    // Parent class properties
    String name;
    int age;
    int rollNo;
    int x;

    // Common behavior for all students
    void markAttendance(){
        System.out.println("marked attendance of "+name+" "+age+" "+rollNo);
    }

    // Parent constructor initializes the common student details
    Student(String name,int age,int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}


class EngineeringStudent extends Student{
    // Child-specific property
    String college;
    int x;

    // This method prints both parent and child data
    // super.x is used to access the parent class field
    void print(){
        System.out.println(name+" "+age+" "+rollNo+" "+college+" "+super.x+" "+x);
    }

    // Overriding the parent method to add child-specific behavior
    void markAttendance(){
        // Call the parent version first
        super.markAttendance();

        // Then perform the child-specific action
        System.out.println(college);
    }

    // Child constructor calls the parent constructor using super()
    EngineeringStudent(String name,int age,int rollNo,String college){
        super(name,age,rollNo);
        this.college = college;
    }

}