public class demo90{
    public static void main(String[] args) {
       /* int y = getResult(5);
        System.out.println(y);*/

       /* String name =(String) getResult("richa"); -->may give classcastexception
        System.out.println(name);  */     

        // String y2 = getResult(23);  //runtime error
        printPair(11, 12); //automatically deduce values passed in parameter -->type inference 
        

    }
   /* public static int getResult(int x){
        return x+5;
    }*/

   /*public static Object getResult(Object x){
    return x;*/
   

/*<T>returnType methodName(T parameter)*/
     public static <T>T getResult(T x){
        return x;
    }



    public static <T,U>void printPair(T first,U second){
        System.out.println(first+" "+second);
    }
}

//generic methods
