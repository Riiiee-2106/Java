package lecture14;

public class demo32 {

    public static void main(String[] args) {
        //understanding call by value 

        int x = 5;
        int y = 10;

        System.out.println(x+","+y);

        addTen(x, y);

         System.out.println(x+","+y);
    }


    static void addTen(int x, int y){
        x = x+10;
        y = y+10;

    }
    
}
