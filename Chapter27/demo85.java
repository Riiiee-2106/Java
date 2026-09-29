package Chapter27;

public class demo85 {


    public static void main(String[] args) {
        //type argument          //optional to pass Integer on rhs
        Box<Integer>b1 = new Box<Integer>(10);
        Box<String>b2 = new Box("hello");

        System.out.println(b2.getValue()+" richa");
        System.out.println(b1.getValue()+4);
        System.out.println(b2.getValue().substring(0,2));

        // String s = (String)b1.getValue(); ==>compile time error

        // siblings cannot be casted 

        
    }
    
}


// Generics
// type information is not lost


class Box <T>{//type parameter
    /*int*/private T value; //any datatype within T, 

    Box(/*int*/T value){
        this.value = value;
    }

    public /*int*/T getValue(){
        return this.value;
    }

    public void setValue(){
        this.value = value;
    }
} 