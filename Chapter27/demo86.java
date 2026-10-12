package Chapter27;

public class demo86 {

    public static void main(String[] args) {
        Pair<Integer,String> p = new Pair(9,"hello");

        System.out.println(p.first+" "+p.second);
        
    }
    
}

// Generic
class Pair <T,U>{
  T first;
    U second;

        Pair(T first,U second){
            this.first = first;
            this.second = second;
        }


}
