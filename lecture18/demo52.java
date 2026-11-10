public class demo52 {

    public static void main(String []args){

        //Autoboxing
        int x = 10;
        Integer y = x; //Autoboxing
        System.out.println(y); //Unboxing
        Integer y1 = new Integer(10); //depreciated version of autoboxing
        //internally how autoboxing happens - 
        Integer y2 = Integer.valueOf(x);


        //unboxing

        Integer x1 = 10;  //internally int y3 = x1.intValue();
        int y3 = x1; //unboxing

    }
    
}
