package Chapter13;

public class demo29 {


   
    
    public static void main(String[] args) {
        
        // Student s = new Student();
        Student s1 = new Student("adi");
        // Student s2 = new Student("vishal",19);
        // Student s3 = new Student("preeti",21,102);
        // Student s4 = new Student("kitya",21,101,"iitg");


        System.out.println(s1.name); 
        System.out.println(s1.rollNumber); 
        System.out.println(s1.age); 
        System.out.println(s1.college); 



    }
    
}


//constructor chaining using this keyword


class Student{

    String name;
    int age;
    int rollNumber;
    String college;


 //we can also call one after another constructor using this


    Student(){  

        //this line should be passed first in constructor - if something is passed before this will give error
       this("unknown");    //this will pass as name is passed in parameter
       System.out.println("first constructor");  //1 se 2nd gya,wapis ake ye print kiya
    }


    Student(String name){
        this(name,0); //-->then this
         System.out.println("second constructor"); //2nd se 3rd gya,wapis aake ye print kiya
    }

    Student(String name,int age){
        this(name,age,0); //-->then this
         System.out.println("third constructor"); //3rd se 4th gya ,wapis aake ye print kiya

    }


    Student(String name,int age,int rollNumber){
         this(name,age,rollNumber,"undefined");//-->then this
          System.out.println("fourth constructor"); //4th se 5th gya , wapis aake ye print kiya
    }

    Student(String name,int age,int rollNumber,String college){
         this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;   //-->then this
        this.college = college;
         System.out.println("fifth constructor"); //5th mei aake ye print kiya
    }

    //2. all the above constructors are calling the next next  constructor using this -- constructor chaining
}
   
    


    
