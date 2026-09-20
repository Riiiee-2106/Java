package Chapter23;

public class demo66{

    public static void main(String[] args) {

       int status = PaymentStatus.SUCCESS;
       System.out.println(status);

    // problem 1 -    runtime error 
    //problem  1 -  type safety
       int status2 = 100;


    //    problem 2 - poor readability 
    if(status == 2){

    }

  
    //problem 3 - no grouping of related entities
    if(status == Role.MANAGER){

    }


    /*if (status == "success"){
    } problem with string - string comparrison slow
     casing different */ 
        
    }
}

// i want to capture payment - status of it - (success,pending,failed nothing else)
    // before enums

    // we use final in constants

    class PaymentStatus{
        /*public static final String SUCCESS = "SUCCESS"; */
        public static final int SUCCESS = 1;
        public static final int FAILED = 2;
        public static final int PENDING = 3;
    }

    class Role{
        public static final int admin = 1;
        public static final int MANAGER = 2;
        // problem - duplicate value allowed - runtime error
        public static final int USER = 2;
    }

    /*all these problems get solved by enum */