public class demo57 {
    

    public static void main(String[] args) {
        
    }
}


class BankAccount{


    public double calculateInterest(double principal){
        return InterestCalculator.calculateYearly(principal,0.09);
        
    }



    //nested static class
    private static class InterestCalculator{

        //function1
        static double calculateYearly(double principal, double rate){
            return principal*rate;
        }

        //function2
        static double calculateMonthly(double principal,double rate){
            return principal*rate;

        }
    }




}

//used cases of static nested class - 
/*1. as helper class for any outer class
2. builder design pattern
3. static methods in nested static class
4. re- res dto
5. */