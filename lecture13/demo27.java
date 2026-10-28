package lecture13;

public class demo27 {

    public static void main(String[] args) {
        
        Student s1 = new Student();
        // 1. what if we dont pass values and called all the values?
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rollNumber);
        System.out.println(s1.college);

        //10.passing values now - (very tedious process - how many variables i need to remember to pass values)

        s1.name = "richa";
        s1.age = 21;
        s1.rollNumber = 101;
        s1.college = "iitg";

        // 2. we get default values
        /*3. default values for non-primitives :- 

        String = null(nothing)
        integer = 0
        float  = 0.0
        boolean = false
        
         */


        //6.primitive variable - stored in stack - scope is within main function -(local scope)
        int x = 5;/*7. does not have default values , we need to pass initialize its value  */

        /*8.
        heap variable may be used for a little more time .
        primitives ,have local scope --> means it is present within a function , so its scope is limited.
        to keep itself optimized java gave default values to non primitives and not to primitives */
    }
    
}

class Student{
    //4. these are information/characteristics/data -->instance variables
    String name;
    int age;
    int rollNumber;
    String college;


    //11. constructors = while creating an object we pass all the values by looking at constraints
    

    //5.behaviours  ---> functions --> instance methods
    void markAttendance(){
        System.out.println("attendance marked for student "+name);
    }
}

