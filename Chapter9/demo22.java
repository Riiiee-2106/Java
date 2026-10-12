package Chapter9;

public class demo22 {

    public static void main(String[] args) {
        
        //multidimensional arrays

        int[][]marks = new int[3][3];


        //input
        marks[0][0]  = 69;
        marks[0][1] = 68;
        marks[0][2] = 67;


        marks[1][0] = 42 ;
        marks[1][1] = 43;
        marks[1][2] = 44;


        marks[2][0] = 59;
        marks[2][1] = 58;
        marks[2][2] = 57;



        //output using loops
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]+" ");
            }
            System.out.println();
        }
       


        System.out.println();


        //otherways to declare and define 2d

        int[][]rollNo = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };


        for(int i =0;i<rollNo.length;i++){
            for(int j = 0;j<rollNo[i].length;j++){
                System.out.print(rollNo[i][j]+" ");
            }System.out.println();
        }


        System.out.println();

        //jacked arrays
        int[][]arr = new int[3][];

        arr[0] = new int[2];
        arr[1] = new int[3];
        arr[2] = new int[4];


        arr[0][0] = 21;
        arr[0][1] = 22;

        arr[1][0] = 23;
        arr[1][1] = 24;
        arr[1][2] = 25;

        arr[2][0] = 26;
        arr[2][1] = 27;
        arr[2][2] = 28;
        arr[2][3] = 29;

        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
