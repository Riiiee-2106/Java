package lecture16;
public class demo37{
    public static void main(String[] args) {
        
        // encapsulation - 


        //1.this is wrong as this field should not be directly accessible to the user - we make it private
        // BankAccount ba = new BankAccount();
        // ba.balance = 100000;

        // System.out.println(ba.balance);

        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.withdrawl(200);
        double balance = ba.getBalance();
        System.out.println(balance);

    }
}

class BankAccount{
    // double balance;

    private double balance;

    public void deposit(int amount){
        balance+=amount;
    }

     public void withdrawl(int amount){
        if(amount<=balance){ //validations
        balance-=amount;
    }
}


    //getter
    public double getBalance(){
        return balance;
    }
}