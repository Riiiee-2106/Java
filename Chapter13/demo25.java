package Chapter13;

public class demo25 {

    public static void main(String[] args) {

        Student s1 = new Student();



        //15. after given values to instance variables - by my own , so now when i print student , all the values i have passed will get printed instead of the default values
        s1.name = "richa singh";
        s1.college = "iitg";
        s1.age = 18;
        s1.rollNumber = 101;

        //16.when i want to assign values to the instance variables i have to follow the above tedious process  - to give them the value , what if i forget some variables, it will take default values which i dont want



        // 17. what if when the object is being created i want to pass the value within the creation of object - this is called as constructors


        //18.constructors - means to create an object 




        //1. when we have not assigned any value within the characteristics of object  - what gets printed



        //2. default values
        System.out.println(s1.name); //null
        System.out.println(s1.rollNumber); // 0
        System.out.println(s1.age); //0
        System.out.println(s1.college); //null


        //5. the way we had local variables or global variables  - the same way in class - we have instance variables or instance methods
        int x = 4; //6. local variable -- x scope is till main function scope
        //7. x is also a primitive datatype -- stores in stack memory

        int y;

       // System.out.println(y);// 12 . local variables dont have default values



    //    13. heap variables have high chance to stay in memory for a longer period of tym as may you will use the object for a longer time

    // 14.but local variable scope is till function existance , main function does not have another rule for it , it still is a function  ---scope is limited , so we dont have given default values , java wants us to give value to local variables



        
    }
    
}



class Student{


    //3. characteristics of real life object   --- also called as instance variables 
    String name;
    int age;
    int rollNumber;
    String college;


    void markAttendance(){ //4. behaviours of real object ----called as instance variables 
        System.out.println("marked attendance for student: "+name);
    }


    //8. when we make instance variables - and when the object is being created  -- all these instance variable is a part of heap memory with object , so they have default values
    
    //9. default values - are the values which are given to instance variables because of we not assigning it directly

    // 10. every datatype has its own default values

    /* 11. primitives
    Integer --> 0
    floating -->0.0
    boolean --> false
    non primitives
    string ---> null(nothing) , as string is a part of non primitive datatype - we make its class and objects   ,String college ---> by default stored null*/
}