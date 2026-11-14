public class demo89{
    public static void main(String[] args) {
      /*  Pair p1 = new Pair(10,"richa"); */
      
        Pairs<Integer,String> pair = new Pairs(101,"richa");
        

    }
}

class Pairs<T,U>{
    T first;
    U second;

    Pairs(T first,U second){
        this.first = first;
        this.second = second;
    }

}

/*
class Pair{
  private  int x;
     private String name;

    Pair(int x, String name){
        this.x =x;
        this.name = name;
    }

    public int getNumValue(){
        return this.x;
    }

    public String getNameValue(){
        return this.name;
    }

    public void setNumValue(int x){
         this.x = x;
    }

    public void setNameValue(String name){
         this.name = name;
    }
}
*/