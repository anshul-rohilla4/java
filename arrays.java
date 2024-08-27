import java.util.Arrays;
import java.util.Scanner;


public class arrays {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

//        int[] rnos=new int[5];
//        int i=0;
//        while(i< rnos.length){
//            rnos[i]=input.nextInt();
//            i++;
//
//        }
//        int[] rnos2={12,64,64,54};
//        for(int a: rnos2){
//            System.out.print(a+" ");
//        }
//      int[] rnos3;
//      rnos3=new int[5];
//
//        String[] names=new String[5];
//        System.out.print(Arrays.toString(rnos));//prints array in String format.


//        int arr2d[][] = new int[3][3];
//        for(int row=0;row<arr2d.length;row++){
//            for(int col=0 ;col<arr2d[row].length;col++){
//                arr2d[row][col]=input.nextInt();
//            }
//        }

//        for(int row=0;row<arr2d.length;row++){
//            for(int col=0 ;col<arr2d[row].length;col++){
//                System.out.print(arr2d[row][col]+" ");
//            }
//            System.out.println();
//        }


        int[][] dynamicArray;
        dynamicArray= new int[][]{
                {1,2,3,5},
                {4,55,66,55,88},
                {54,51,54,534,35},
                {46}

        };
        System.out.println("lenjf");
        System.out.println(dynamicArray.length-1);

//        for(int row1=0;row1< dynamicArray.length;row1++){
//            for(int col1=0;col1<dynamicArray[row1].length;col1++){
//                System.out.println(Arrays.toString(dynamicArray));
//            }
//        }


    }


}
