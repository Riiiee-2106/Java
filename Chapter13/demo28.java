package Chapter13;

public class demo28 {

   
    
    public static void main(String[] args) {
        
        Student s = new Student();
        Student s1 = new Student("adi");
        Student s2 = new Student("vishal",19);
        Student s3 = new Student("preeti",21,102);
        Student s4 = new Student("kitya",21,101,"iitg");


        System.out.println(s.name); 
        System.out.println(s.rollNumber); 
        System.out.println(s.age); 
        System.out.println(s.college); 



    }
    
}


//constructor chaining using this keyword


class Student{

    String name;
    int age;
    int rollNumber;
    String college;





    Student(){  
     this("unknown",0,0,"unknown");
    }


    Student(String name){
        //1. name = name; //warning  - it will take instance name variable and put name value in it , same value in same variable
        this(name,0,0,"undefined");
    }

    Student(String name,int age){
        this(name,age,0,"undefined");

    }


    Student(String name,int age,int rollNumber){
         this(name,age,rollNumber,"undefined");
    }

    Student(String name,int age,int rollNumber,String college){
         this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //2. all the above constructors are calling the last constructor using this -- constructor chaining
}
   
    

