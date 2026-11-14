public class demo92{
    public static void main(String[] args) {
        Animals<Fish> fish = new Animals();
        
    }
}
/*T extends Class & interface this is boundation*/
class Animals<T extends Animal & Swimmable>{
    T value;
}
class Animal{
    void display(){
        System.out.println("displaying animals");
    }

}
interface Swimmable{
    void swim();
}

class Dog extends  Animal{

}
class Fish extends Animal implements Swimmable{
    @Override
    public void swim(){
        System.out.println("fish is swimming");

    }

}