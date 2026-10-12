package Chapter22;
import java.util.Objects;
public class demo63{


    public static void main(String[] args) {
       

        Student s1 = new Student("aditya",21);
        Student s2 = new Student("aditya",21);


        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() ==  s2.hashCode());
    }
    
}



class Student{

    String name;
    int age;


    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

   

    //.equals()

      @Override 
      public boolean equals(Object obj){

        if (this == obj){
            return true;
        }

        
        if(obj == null){
            return false;
        }

   
        if(obj.getClass() != this.getClass()){
            return false; 
        }

        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);

       
      }



      //hashcode()

      @Override 
      public int hashCode(){

        // why prime - two different object dont give same hashes
       
        /*int result = 17;
        result =result *31 +age;

        // name hashcode works only when name is not null 

        result = result*31+((name == null)? 0:name.hashCode());
        return result;*/


        //internally we write - short ->  
        return Objects.hash(name,age);

      }

    }
