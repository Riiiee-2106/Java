package lec19;

public class demo47 {


    // static nested class using access modifier example
    public static void main(String[] args) {
        
    }
    
}


class BankAcc{


    static class InterestCalculator{

        // private int x;
    
   private static double calculateYearly(double p, double r){

            return p*r;

   }

   private static double calculateMonthly (double p, double r){
        return (p*r)/1200;
   }

    }

     

    public double computeInterest(double p){
        System.out.println(InterestCalculator.calculateMonthly(p, 0.08));
       return  InterestCalculator.calculateYearly(p, 0.09);
      
       
    }
}


//used cases of static nested class
// - as helper class for any outer class
// -builder design pattern
// -if you want to have static methods inside nested class
// - request / response DTO

