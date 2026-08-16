package lec27;

public class demo76 {

    public static void main(String[] args) {
        Pair<Integer,String> p1 = new Pair<>(21, "hello world");


        System.out.println(p1.first +"  "+p1.second);
        
    }
    
}


class Pair<T,U>{

    T first;
    U second;

    Pair(T first,U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }

    public void setFirst(T first){
        this.first = first;
    }

    public void setSecond(U second){
        this.second = second ;
    }


}