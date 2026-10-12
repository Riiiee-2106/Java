package Chapter23;
public class demo67{


    //enum  -- enumerations(enumerated type)
    // predefined set of constants

    public static void main(String[] args) {

        PaymentStatus status = PaymentStatus.FAILED;

        System.out.println(status.name());

        // if(status == "success"); compile time error
        
    }
    
}

enum PaymentStatus{
    SUCCESS,
    PENDING,
    FAILED;
}