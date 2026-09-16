package Chapter13;

public class demo27 {
    
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


        System.out.println();


        System.out.println(s1.name); 
        System.out.println(s1.rollNumber); 
        System.out.println(s1.age); 
        System.out.println(s1.college); 

        System.out.println();

        
        System.out.println(s2.name); 
        System.out.println(s2.rollNumber); 
        System.out.println(s2.age); 
        System.out.println(s2.college); 

        System.out.println();

         System.out.println(s3.name); 
        System.out.println(s3.rollNumber); 
        System.out.println(s3.age); 
        System.out.println(s3.college); 

        System.out.println();

         System.out.println(s4.name); 
        System.out.println(s4.rollNumber); 
        System.out.println(s4.age); 
        System.out.println(s4.college); 



    }
    
}


//constructor overload


class Student{

    String name;
    int age;
    int rollNumber;
    String college;





    Student(){  

    }


    Student(String name){
        //1. name = name; //warning  - it will take instance name variable and put name value in it , same value in same variable
        this.name = name;
    }

    Student(String name,int age){
        this.name = name;
        this.age = age;

    }


    Student(String name,int age,int rollNumber){
         this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    Student(String name,int age,int rollNumber,String college){
         this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //2. all the above constructors are calling the last constructor - constructor overload
}
   