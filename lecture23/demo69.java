package lecture23;

public class demo69 {

    public static void main(String[] args) {

        //1.a payment status can be - success,failed,pending  , how should i represnt it in programmingbefore java 5 before enum

       /*  int status = PaymentStatus.SUCCESS;
        System.out.println(status); //1.problem - type safety
        int status2 = 100; //any value can be passed (run time bugs)*/

   /*  if(status ==2){ 2. problem - poor readability

    } */

  /* if(status == Role.ADMIN){3.problem - no grouping of related entity

   }*/

 /*  String status = PaymentStatus.FAILEDD;*/

  /*if(status == "failedd"){string comparison slow , upper lower casing mismatch

  }*/
   //ENUM DECLARATION
  PaymentStatus status3 = PaymentStatus.SUCCESS;
  /*PaymentStatus status4 ="error"; //compile time error
  PaymentStatus status5 = 100; //compile time error*/

  System.out.println(status3.name());

  



        
    }
    
}

/* 
class PaymentStatus{
    public static final int SUCCESS = 1;
    public static final int FAILED = 2;
    public static final int PENDING = 3;
    public static final String FAILEDD = "failed";
    //4. problem from string 
}


class Role{
    public static final int ADMIN = 1;
    public static final int MANAGER = 2;
    public static final int EMPLOYEE = 2; //6.problem duplicate case but no error in compile time
*/

    //here comes enum --> predefined set of constants  (Enumerated type) -enumerations
    
    

    //syntax of enum -

    enum PaymentStatus{
        SUCCESS,
        FAILED,
        PENDING;
    }


}