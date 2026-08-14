package lec13;

public class demo22 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        // if nothing is assigned in Student ,all instance variable will have null values

        // default values 
        System.out.println(s1.name);
        System.out.println(s1.rollNo);
        System.out.println(s1.age);
        System.out.println(s1.college);

        // just like we had local variable  -->stored in stack memory
        int x = 4;//local variable don't have default values - as they are stored in stack, less chance to stay longer -- function ,have limited scope
        // therefore first we need to assign a value to local
    }
    
}


class Student{

    // information/characteristics/data ----> instance variable --->heap memory
    // these instance variable have default values
    // string = null(nothing)
    // integer = 0
    // float = 0.0
    // boolean = false

    // while instance variable stored in stack have higher chance to stay in memory for use

    String name;
    int age;
    int rollNo;
    String college;

    // behaviours --->instance methods
    void markAttendance(){

    }
}