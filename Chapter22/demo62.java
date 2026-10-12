package Chapter22;
public class demo62{

    public static void main(String[] args) {

        Student s1 = new Student("aditya",21);
        Student s2 = new Student("aditya",21);

        //as of now when i compare s1 and s2,they compare the default implementation of.equals i.e references, as it uses == internally

        System.out.println(s1.equals(s2));

      

        
    }

}



class Student{

    String name;
    int age;


    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

      // instead i want to compare the values
      //overriding the .equals

      @Override 
      public boolean equals(Object obj){

        if (this == obj){
            return true;
        }

        //what if null value
        if(obj == null){
            return false;
        }

        //object can be anything ,so avoid castclassexception
        if(obj.getClass() != this.getClass()){
            return false; //check same type of class of both
        }


        //convert to student and then compare
        Student s = (Student) obj;
        return (this.name == s.name && this.age == s.age);

       
      }

    }
