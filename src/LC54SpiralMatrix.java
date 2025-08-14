import java.util.ArrayList;
import java.util.List;

public class LC54SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
        int[][] matrix2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(matrix2));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result= new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;

        System.out.println(m+" "+n);

        for(int i=0;i<n;i++){
            result.add(matrix[0][i]); //top row

        }
        for(int i=1;i<m;i++){
            result.add(matrix[i][n-1]);//last column - (top element)
        }

        for(int i=n-2;i>=0;i--){
            result.add(matrix[m-1][i]);//bottom row - (last element)
        }

        for(int i=m-2;i>=1;i--){
            result.add(matrix[i][0]);//first column -(bottom element & top element)
        }




        return result;
    }
}

