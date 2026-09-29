package Chapter27;

public class demo87 {

    // Generic method

    public static void main(String[] args) {
        int y = getResult(10);
        System.out.println(y);


         String y1 = getResultt("hello");
        System.out.println(y1);


        printPair(10, "hello"); //type argument  - it itself mark the parameter -->known as type inference
        
    }


    public static int getResult(int x){
        return x+5;
    }    



    /*
    <T>T(return type) functionName(T(returntype) Parameter){


    } 
    */


    public static <T>T getResultt(T x){ //type parameter
        return x;
    }


    public static <T,U>void printPair(T first , U second){//type parameter
        System.out.println(first+" "+second);
    }



}
