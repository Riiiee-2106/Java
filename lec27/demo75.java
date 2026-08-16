package lec27;

public class demo75 {

    public static void main(String[] args) {
        // if no type is passed ,pass Object by  default
                                //optional to pass type in rhs
        Box<Integer> b  = new Box<>(10); //type argument
        Box<String>b2 = new Box<>("hello");

        System.out.println(b.getValue()+5);
        System.out.println(b2.getValue()+"  hello");  //no runtime exceptionss

        // String s = (String)b.getValue();//this will give me compile time error
        // siblings can not  

        // System.out.println(b.getValue().substring());  we cant do something related to runtime exception


        // type information is not lost

        // they know what is there type and what operations can be done on them
        
    }
    
}



// generics 
class Box<T>{

    private T value; //expect parameter

    Box(T value){
        this.value = value;
    }


    public T getValue(){
        return this.value;
    }


    public void  setValue(T value){
        this.value = value;
    }
}