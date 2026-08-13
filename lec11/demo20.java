package lec11;

public class demo20 {
    // scope of variable

    static int a; //global scope  - will study why we apply static here later
    public static void main(String[] args) {
        

        int x = 4;
        int y = 5;
        System.out.println(x+y); //local scope

        if(x==4){
            int j=7; //j is block scoped
            System.out.println(j);
        }

        // System.out.println(j); - cant access
    }

    static void add(){
        // System.out.println(x+y); //can't access if not passed in argument and fetched in parameter
    }
    
}
