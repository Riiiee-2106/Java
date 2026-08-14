package lec14;

public class demo28 {

    // call by value

    public static void main(String[] args) {
        
        int x = 4;
        int y = 5;
        System.out.println(x+" , "+y);

        addTen(x, y);

        // why there is no change in x and y value?
        System.out.println(x+" , "+y);

    }


    static void addTen(int x,int y){
        x+=1;
        y+=1;
    }
    
}
