package Chapter22;
public class demo61{
    public static void main(String[] args) {
        //object class

        Student s1 = new Student();
        s1.name = "aditya";
        s1.age = 28;


        System.out.println(s1.toString());  //Student@hexcode   before overriding object toString()

        System.out.println(s1.toString()); 
        //even without writing toString() println internally uses toString() , so it prints the value directly in string format

        System.out.println(s1);  
    }
}

    class Student  /*extends Object optional to write*/{
        String name;
        int age;

        @Override
        public String toString(){
           return (name+" "+age);

        }


    }
