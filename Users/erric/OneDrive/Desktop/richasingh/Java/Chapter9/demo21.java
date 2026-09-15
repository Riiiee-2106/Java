package Chapter9;

public class demo21 {

    public static void main(String[] args) {
        //declaration of arrays 
        int[]arr = new int[3];


        //supported in old languages - syntax
        int arr2[] = new int[3];

/* 
        //input
        arr[0] = 101;
        arr[1] = 102;
        arr[2] = 103;

        //output
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        */


        //length of array
        System.out.println(arr.length);



        //using loops - input
        int x = 100;
        for(int i=0;i<3;i++){
            arr[i] = x++;
        }


        //output
        for(int i=0;i<3;i++){
            System.out.println(arr[i]+" ");
        }



    }
    
}
