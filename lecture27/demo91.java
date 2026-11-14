public class demo91{

    // bounds in generic 
    public static void main(String[] args) {
        Box<Integer>b1 = new Box<>();
        b1.value = 1;  

    }
}

/*
class Box<T>{
    T value;

    public void printDouble(){
        //as we dont know the generic parameter datatype as of now - we can not call any method on the values,
        // as all values are child of object class we can only call object class methods in it
        //System.out.println(value.getDouble());
        System.out.println(value.toString());

        //but we can expect some datatype with bounds - bounds give us availability on wht datatypes we can call 
    }

}*/


class Box<T extends Number>{
    T value;

    public void printDouble(){

        // generics = T can be anything
    //   bounds in generic
        //now i can call all methods or everything sub type of Number
        System.out.println(value.doubleValue());

    //  Upper bound - T is atleast Number or its subtype
    }

}