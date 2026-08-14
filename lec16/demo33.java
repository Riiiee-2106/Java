package lec16;

public class demo33 {

    public static void main(String[] args) {
        // Encapsulation - hiding internal data and exposing through controlled methods

        // Create a BankAccount object - balance is private, can't access directly
        BankAccount ba = new BankAccount();
        
        // Deposit money - only through the public deposit method
        ba.deposit(1000);
        
        // Withdraw money - only through the public withdraw method with validation
        ba.withdraw(200);
        
        // Get balance - only through the public getter method
        double  leftBalance = ba.getBalance();
        System.out.println(leftBalance);  // Output: 800
    }
    
}

class BankAccount{
    // Private variable - cannot be accessed directly from outside the class
    private double balance;

    // Public method to withdraw money with validation
    public void withdraw(int amount){
        // Check if sufficient balance exists before withdrawing
        if(amount<=balance){
            balance-=amount;
        }
    }

    // Public method to deposit money
    public void deposit(int amount){
        // Add amount to balance
        balance+=amount;
    }

    // Public getter method - safe way to access private balance
    public double getBalance(){
        return balance;
    }
}


class Student{
    // Private data members - encapsulation principle
    private String name;
    private int rollNumber;
    private int age;
    private String college;

    // Constructor - initializes Student object with provided values
    Student(String name,int rollNumber,int age,String college){
        // Initialize private variables using 'this' keyword
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }


    // getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
         this.name = name;
    }

    public String getClg(){
        return college;
    }


    public void setClg(String college){
         // ----- validations
        this.college = college;
    }
}