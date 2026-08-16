package lec27;

public class demo77 {

    public static void main(String[] args) {
        // we need to collect data in same type of datatype which we are passing in value
     String y = getResult("hello");
     

     getResult("richa","singh");  //Type inference
     
    }




    // generic method
    // <T> returnType methodName (T parameter){
    // }



    public static  <T,U> void getResult(T first,U second){
        System.out.println(first+" "+second);
    }

    public static <T>T  getResult(T x){
        return x;
    }
    
}

// Generic method