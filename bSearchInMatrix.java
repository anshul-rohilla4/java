import java.util.Arrays;

public class bSearchInMatrix {
    public static void main(String[] args){

        int[][] matrix={
                {10,25,35,45},
                {11,27,39,50},
                {19,30,55,60}
        };

        System.out.println(Arrays.toString(search(matrix,45)));


    }
    static int[] search(int[][] matrix,int target){
        int row=0;
        int col=matrix.length;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==target){
                return new int[]{row,col};
            }
            if(matrix[row][col]<target){
                row++;
            }else
                col--;
        }
        return new int[]{-1,-1};

    }
}
