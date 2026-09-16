package Chapter16;

public class demo35 {

    //encapsulation


    public static void main(String[] args) {
        
    BankAccount ba = new BankAccount();

    //cannot access balance field
    // ba.balance  = 1000000.00;

    // System.out.println(ba.balance);

    ba.deposit(100000);
    ba.withdraw(50000);
    System.out.println(ba.getBalance());
    

    
}
}


class BankAccount{
    //instance variables
    private double balance;


    //instance methods
    public void deposit(int amount){
        balance+=amount;
    }

    public void withdraw(int amount){
        balance-=amount;
        
    }


    //getters and setters

    public double getBalance(){
        return balance;
    }
}


class Student{
    String name;
    int rollNumber;
    int age;
    String college;


    Student(String name,int age,int rollNumber,String college){
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

    //getters
    public String getName(){
        return name;
    }


    //setters
    public void setName(String name){
        //here it will have multiple validation checks -- for eg in college we will check whether clg exists


        //name should be first name and last name -- many validations can be applied in setters
        this.name = name;
    }


    public String getCollege(){
        return college;
    }


    //setters
    public void setCollege(String name){
        //here it will have multiple validation checks -- for eg in college we will check whether clg exists
        

        //validation --> college should be real
    }
}