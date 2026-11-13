public class demo74{
    public static void main(String[] args) {
        

        //uses polymorphism for dynamic dispatch
        Payment p = new DebitCard(); //we can write either debitcard or credit card dynamically - provide framework or base around springboot via interfaces and abstract classes - base of clean architecture
        p.pay();
    }
}

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    @Override
    public void pay(){
        System.out.println("payment via credit card");
    }
}


class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("payment via debit card");
    }
}