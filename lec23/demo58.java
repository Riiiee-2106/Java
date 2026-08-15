package lec23;

public class demo58 {


    public static void main(String[] args) {

        // before enumss--- we used static final variables -- 
        // what are the problems which we can face due to this
        // 1.type safety ---run time bugs ,no compile time error
     
        int status = PaymentStatus.SUCCESS;
        System.out.println(status);
        status = 100;

        System.out.println(status);
        int status2 = PaymentStatus.FAILED;


        // 2.poor readability
        // if(status2 == 2){ 

        // }


        // 3.no grouping
        // if(status2 ==Role.MANAGER){

        // }




        
    }
    
}


// payment status --->success,failed,pending

class PaymentStatus{
   final static  int SUCCESS = 1;
   final static  int FAILED = 2;
   final static  int PENDING = 3;

//    what if used string instead of int
// new problem

// lower uppercase
// string comparison is slow


    }


class Role{
    final static int ADMIN = 1;
    final static int MANAGER = 2;
    final static int MANAGER2 = 2;
    // duplicate value is also ok
}